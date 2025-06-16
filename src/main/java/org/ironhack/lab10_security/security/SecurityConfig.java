package org.ironhack.lab10_security.security;

import lombok.RequiredArgsConstructor;
import org.ironhack.lab10_security.security.filters.CustomAuthenticationFilter;
import org.ironhack.lab10_security.security.filters.CustomAuthorizationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.springframework.http.HttpMethod.*;
import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;

/**
 * This is the main configuration class for security in the application. It enables web security,
 * sets up the password encoder, and sets up the security filter chain.
 */
@Configuration
@EnableWebSecurity // Indica que esta clase configura la seguridad web con Spring Security
@RequiredArgsConstructor
public class SecurityConfig {

    // Servicio que Spring Security utiliza para cargar detalles de usuario desde la base de datos
    private final UserDetailsService userDetailsService;

    // Builder que nos permite construir el AuthenticationManager
    private final AuthenticationManagerBuilder authManagerBuilder;


    /**
     * Bean definition for AuthenticationManager
     *
     * @param authenticationConfiguration the instance of AuthenticationConfiguration
     * @return an instance of the AuthenticationManager
     * @throws Exception if there is an issue getting the instance of the AuthenticationManager
     */
    // Define el bean para el AuthenticationManager, necesario para la autenticación de usuarios.
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    /**
     * Bean definition for SecurityFilterChain
     *
     * @param http the instance of HttpSecurity
     * @return an instance of the SecurityFilterChain
     * @throws Exception if there is an issue building the SecurityFilterChain
     */
    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // Filtro personalizado de autenticación (login)
        CustomAuthenticationFilter customAuthenticationFilter = new CustomAuthenticationFilter(authManagerBuilder.getOrBuild());

        // endpoint para login
        customAuthenticationFilter.setFilterProcessesUrl("/api/login");  // <---- si quiero que mi login sea otro lo modifico aquí TAMBIÉN

        // Desactiva CSRF (no necesario en APIs con JWT, no usamos sesiones)
        http.csrf().disable();

        // No guardamos sesiones (stateless --> que no se guarden sesiones en el servidor)
        http.sessionManagement().sessionCreationPolicy(STATELESS);

        // Configura los accesos públicos, privados y por rol
        // <---- aquí es donde añadiré mis endpoints, si son públicos o no y con qué roles puedo acceder a los privados
        http.authorizeHttpRequests((requests) -> requests

                //Rutas para author
                .requestMatchers(GET,"/api/author/*").permitAll()// public endpoint, no tienes que estar logeado ni ser parte de mi aplicación

                .requestMatchers(POST, "/api/author").hasAnyAuthority("ROLE_ADMIN")
                .requestMatchers(PUT, "/api/author/*").hasAnyAuthority("ROLE_ADMIN")
                .requestMatchers(DELETE, "/api/author/*").hasAnyAuthority("ROLE_ADMIN")

                //Rutas para BlogPost
                .requestMatchers(POST, "/api/blogPost").hasAnyAuthority("ROLE_ADMIN")
                .requestMatchers(PUT, "/api/blogPost/*").hasAnyAuthority("ROLE_ADMIN")
                .requestMatchers(DELETE, "/api/blogPost/*").hasAnyAuthority("ROLE_ADMIN")

                .anyRequest().authenticated()); // aquí indicamos que cualquier otro endpoint tiene que tener autenticación (privado)

        // Añade el filtro de autenticación al objeto http de seguridad
        http.addFilter(customAuthenticationFilter);

        // Añade el filtro de autorización
        http.addFilterBefore(new CustomAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);

        // Construye y retorna el SecurityFilterChain
        return http.build();
    }
}