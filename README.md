
![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB | Java Spring Security (Spring Seguridad)

## Introducción

Acabamos de aprender cómo usar Spring Security para agregar autenticación y autorización a la aplicación, así que practiquemos un poco más.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Instrucciones

Para esta actividad, construirás un sistema de gestión de contenido para un blog con múltiples autores.

1. **Crear tablas**: Crea las tablas para la publicación del blog y el autor en tu base de datos.
2. **Usar Spring Security**: Usa Spring Security para crear un rol de administrador.
3. **Crear rutas**: Crea las siguientes rutas:

   - Obtener la publicación y el autor
   - Agregar publicación
   - Agregar autor
   - Actualizar publicación
   - Actualizar autor
   - Eliminar publicación
   - Eliminar autor

4. **Restringir acceso**: Usa Spring Security para asegurarte de que solo los administradores puedan acceder a todas las rutas excepto la ruta GET, que debería estar disponible públicamente.
5. **Crear pruebas**: Crea pruebas para todas las rutas y documenta tu API.

<br>

**Blog Post Table** (Tabla de publicación del blog)

| id  | author_id | title                                     | post                                                   |
| --- | --------- | ----------------------------------------- | ------------------------------------------------------ |
| 1   | 1         | Boost Your Productivity with 10 Easy Tips | Productivity - we all want it but it seems ...         |
| 2   | 1         | How to Focus                              | Do you ever sit down to work and find yourself ...     |
| 3   | 2         | Learn to Speed Read in 30 Days            | Knowledge, not ability, is the great determiner of ... |

<br>

**Author Table** (Tabla de autores)

| id  | name          |
| --- | ------------- |
| 1   | Aiko Tanaka   |
| 2   | Jonas Schmidt |
| 3   | Cas Van Dijk  |

<br>

## FAQs (Preguntas frecuentes)

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">Estoy atascado y no sé cómo resolver el problema o por dónde empezar. ¿Qué debo hacer?</summary>

  <br> <!-- ✅ -->

  Si estás atascado en tu código y no sabes cómo resolver el problema o por dónde empezar, debes dar un paso atrás y tratar de formular una pregunta clara y directa sobre el problema específico que enfrentas. El proceso que seguirás al tratar de definir esta pregunta te ayudará a limitar el problema y a encontrar soluciones potenciales.

  Por ejemplo, ¿estás enfrentando un problema porque no entiendes el concepto o estás recibiendo un mensaje de error que no sabes cómo arreglar? Por lo general, es útil intentar formular el problema de la manera más clara posible, incluyendo cualquier mensaje de error que estés recibiendo. Esto puede ayudarte a comunicar el problema a otras personas y, potencialmente, a obtener ayuda de tus compañeros o recursos en línea.

  Una vez que tengas una comprensión clara del problema, deberías poder comenzar a trabajar hacia la solución.

</details>
  
<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo creo un proyecto de Spring boot?</summary>

  <br> <!-- ✅ -->

Spring boot es un framework para crear aplicaciones autónomas y de calidad de producción que son fáciles de lanzar y ejecutar. La mejor manera de crear un proyecto de Spring boot es usar el sitio web Spring Initializer. El sitio web proporciona una manera conveniente de generar una estructura básica de proyecto con todas las dependencias y configuraciones necesarias.

- Paso 1: Ve a [start.spring.io](https://start.spring.io/)
- Paso 2: Elige el tipo de proyecto que desea crear, como Maven o Gradle.
- Paso 3: Selecciona la versión de Spring Boot que deseas utilizar.
- Paso 4: Elige las dependencias que necesitas para tu proyecto. Algunas dependencias comunes incluyen web, jpa y data-jpa.
- Paso 5: Haz clic en el botón "Generar" para descargar los archivos del proyecto.

Como alternativa, puedes usar un Entorno de Desarrollo Integrado (IDE) como Eclipse o IntelliJ IDEA. Estos IDEs tienen complementos para crear proyectos de Spring boot, lo que facilita la configuración del entorno y el inicio de la codificación.

</details>
  
<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Qué es JPA y cómo puedo usarlo en Java?</summary>  

 <br> <!-- ✅ -->  

JPA significa Interfaz de Persistencia Java, que es una especificación Java para acceder, persistir y gestionar datos entre objetos Java y una base de datos relacional. JPA proporciona una interfaz estándar para acceder a bases de datos, reduciendo la necesidad de código personalizado de acceso a datos y permitiendo una gestión eficiente de las conexiones a la base de datos.

Para usar JPA en Java, necesitarás incluir las dependencias necesarias en su proyecto, como la implementación JPA de Hibernate y crear clases de entidades para representar sus datos. Estas clases de entidades serán anotadas con anotaciones específicas de JPA, como `@Entity` y `@Id`, para indicar la asignación entre la clase Java y la tabla de la base de datos.

Aquí hay un fragmento de código para mostrar cómo crear una clase de entidad JPA en Java:

  ```java
  @Entity
  public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private String position;

    // Getters and Setters for the attributes
  }
  ```

</details>  

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es el propósito de usar las anotaciones "@Entity", "@Table" y "@Column" en JPA (Java Persistence API)?</summary>  

 <br> <!-- ✅ -->  

Las anotaciones `@Entity`, `@Table` y `@Column` en JPA (Java Persistence API) se utilizan para mapear objetos Java a tablas de bases de datos relacionales.

`@Entity` se utiliza para marcar una clase como una entidad persistente. Esto significa que las instancias de la clase pueden almacenarse en una base de datos.

`@Table` se utiliza para definir el nombre de la tabla de base de datos a la que se asignará la entidad.

`@Column` se utiliza para definir las columnas en la tabla que corresponden a los atributos de la entidad.

Aquí hay un ejemplo de cómo usar estas anotaciones:

  ```java
  @Entity
  @Table(name="employee")
  public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    //getters and setters
  }
  ```

  En este ejemplo, la clase `Employee` se marca como una entidad persistente usando la anotación `@Entity`. El nombre de la tabla de base de datos se define usando la anotación `@Table` como "employee" (empleado). Los atributos `id`, `firstName` y `lastName` se mapean a columnas en la tabla "employee" (empleado) usando la anotación `@Column`.

</details>  

<br>


<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es el propósito de usar las anotaciones "@RestController", "@GetMapping" y "@ResponseStatus" en Java para construir un servicio web RESTful?</summary>

  <br> <!-- ✅ -->

  La anotación `@RestController` se utiliza en Java para definir una clase como un controlador de servicio web RESTful. Esta anotación permite que la clase maneje solicitudes HTTP y devuelva respuestas HTTP.

  La anotación `@GetMapping` se utiliza para asignar una solicitud HTTP GET específica a un método en una clase de controlador. Esto permite que el método maneje la solicitud y devuelva una respuesta.

  La anotación `@ResponseStatus` se utiliza para establecer el código de estado HTTP para la respuesta devuelta por un método en una clase de controlador.

  Aquí hay un fragmento de código que muestra cómo usar estas anotaciones en Java:

  ```java
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.ResponseStatus;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.http.HttpStatus;

  @RestController
  public class ExampleController {

    @GetMapping("/example")
    @ResponseStatus(HttpStatus.OK)
    public String exampleMethod() {
      return "This is a response from a RESTful web service";
    }
  }
  ```

  En este ejemplo, se define la clase `ExampleController` como un controlador de servicio web RESTful utilizando la anotación `@RestController`. El método `exampleMethod` está mapeado a una solicitud HTTP GET específica utilizando la anotación `@GetMapping("/example")` y el código de estado HTTP de la respuesta se establece en `HTTP 200 OK` utilizando la anotación `@ResponseStatus(HttpStatus.OK)`.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Qué son las anotaciones "@RestController", "@PostMapping", "@PutMapping", "@PatchMapping" y "@ResponseStatus" en Java y cómo se utilizan para construir un servicio web RESTful?</summary>

  <br> <!-- ✅ -->

  Las anotaciones `@RestController`, `@PostMapping`, `@PutMapping`, `@PatchMapping` y `@ResponseStatus` se utilizan en Java para construir servicios web RESTful.

  La anotación `@RestController` se utiliza para indicar que una clase sirve como controlador REST. Esto significa que la clase manejará solicitudes HTTP y proporcionará respuestas de manera RESTful.

  Las anotaciones `@PostMapping`, `@PutMapping` y `@PatchMapping` se utilizan para manejar solicitudes HTTP POST, PUT y PATCH, respectivamente. Estas anotaciones se utilizan para especificar el endpoint que manejará el tipo de solicitud correspondiente.

  La anotación `@ResponseStatus` se utiliza para establecer el código de estado de respuesta HTTP.

  Aquí hay un ejemplo de cómo se pueden usar estas anotaciones:

  ```java
  @RestController
  public class MyController {

    @PostMapping("/api/create")
    @ResponseStatus(HttpStatus.CREATED)
    public MyEntity create(@RequestBody MyEntity entity) {
      // logic to create the entity
      return entity;
    }

    @PutMapping("/api/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MyEntity update(@PathVariable long id, @RequestBody MyEntity entity) {
      // logic to update the entity
      return entity;
    }

    @PatchMapping("/api/partial-update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MyEntity partialUpdate(@PathVariable long id, @RequestBody MyEntity entity) {
      // logic to partially update the entity
      return entity;
    }
  }
  ```

  In this example, the `@RestController` annotation is applied to the class `MyController`, indicating that it serves as a REST controller. The `@PostMapping`, `@PutMapping` and `@PatchMapping` annotations are used to handle HTTP POST, PUT and PATCH requests respectively. The `@ResponseStatus` annotation is used to set the HTTP response status code to `HttpStatus.CREATED`, `HttpStatus.OK`, or `HttpStatus.OK` respectively.

  En este ejemplo, la anotación `@RestController` se aplica a la clase `MyController`, lo que indica que funciona como controlador REST. Las anotaciones `@PostMapping`, `@PutMapping` y `@PatchMapping` se utilizan para manejar las solicitudes HTTP POST, PUT y PATCH, respectivamente. La anotación `@ResponseStatus` se utiliza para establecer el código de estado de respuesta HTTP en `HttpStatus.CREATED`, `HttpStatus.OK` o `HttpStatus.OK`, respectivamente.

</details> 

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es el propósito de usar las anotaciones "@NotEmpty", "@Pattern" y "@Digits" en Java?</summary>

  <br> <!-- ✅ -->

  Las anotaciones `@NotEmpty`, `@Pattern` y `@Digits` en Java se utilizan para validar los valores de entrada de un formulario o un cuerpo de solicitud. Estas anotaciones se utilizan para asegurarse de que los valores de entrada no estén vacíos, coincidan con un patrón específico o tengan un número específico de dígitos.

  Aquí hay un fragmento de código que demuestra el uso de estas anotaciones:

  ```java
  public class User {

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message = "Invalid email format")
    private String email;

    @Digits(integer = 5, fraction = 0, message = "Contact number must have 5 digits")
    private String contactNumber;

    // getters and setters
  }
  ```

  En el código anterior, el campo `name` no debe estar vacío, el campo `email` debe coincidir con el patrón de correo electrónico especificado y el campo `contactNumber` debe tener 5 dígitos. Si no se cumplen alguna de estas condiciones, se mostrará un mensaje al usuario.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es el propósito de "@JsonIgnore" en Java y cómo se utiliza?</summary>

  <br> <!-- ✅ -->

  La anotación `@JsonIgnore` se utiliza en Jackson (una biblioteca popular para el procesamiento de JSON) para ignorar una propiedad al serializar o deserializar un objeto de/a JSON. Esto significa que cuando el objeto se convierte a JSON, la propiedad marcada con `@JsonIgnore` no se incluirá en la representación JSON.

  La anotación `@JsonIgnore` se aplica a una propiedad en una clase de Java para ignorarla durante la serialización o deserialización de JSON. Por ejemplo, consideremos una clase llamada Employee con una propiedad llamada "password". Para ignorar la propiedad "password", podemos anotarla con `@JsonIgnore`:

  ```java
  public class Employee {
    private String name;
    private int age;
    @JsonIgnore
    private String password;

    // getters and setters for the properties
  }
  ```

  Cuando esta clase se serialice a JSON, la propiedad "password" no se incluirá en la representación JSON.

</details>

<br>

<details>    
 <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Qué es "JpaRepository" y cómo puedo usarlo en Java?</summary>   
 
 <br> <!-- ✅ -->    
  
  `JpaRepository` es una interfaz de Spring Data que extiende la interfaz `PagingAndSortingRepository`. Proporciona todas las operaciones básicas **CRUD (Create, Read, Update, Delete)** (Crear, Leer, Actualizar, Eliminar) y métodos adicionales para trabajar con **JPA (Java Persistence API)** para interactuar con la base de datos.  
  
  Para usar JpaRepository en su proyecto, siga los siguientes pasos:  
  
  Paso 1: Importa las bibliotecas necesarias  
  
  ```java
  import org.springframework.data.jpa.repository.JpaRepository;
  ```

  Paso 2: Crea una interfaz que extienda `JpaRepository`  
  
  ```java
  public interface MyRepository extends JpaRepository<MyEntity, Long> {

  }
  ```

  **Nota**: En el código anterior, `MyEntity` es la clase de entidad con la que desea interactuar y Long es el tipo de la clave primaria de `MyEntity`.  
    
  Paso 3: Inyecta la interfaz en la clase donde la desees usar.  
  
  ```java
  @Autowired
  private MyRepository myRepository;
  ```

  Paso 4: Ahora puedes usar los métodos proporcionados por `JpaRepository` para interactuar con la base de datos, por ejemplo:  
    
  ```java
  MyEntity myEntity = new MyEntity();
  myRepository.save(myEntity);
  ```

  Con los pasos anteriores, ahora puedes usar `JpaRepository` para interactuar con la base de datos en tu proyecto de Java.  
  
</details>  

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Qué son los métodos de consulta derivados en JPA y cómo los uso en Java?</summary>

  <br> <!-- ✅ -->
  
  Los métodos de consulta derivados en JPA son métodos en un repositorio JPA que son generados automáticamente por el marco de trabajo basados en los nombres de método. Estos métodos permiten a los desarrolladores realizar operaciones comunes en la base de datos, como encontrar entidades basadas en criterios específicos, ordenamiento, paginación y más, sin tener que escribir manualmente la consulta SQL correspondiente.

  Para utilizar los métodos de consulta derivados en Java con JPA, siga estos pasos:

  1. Cree una interfaz de repositorio JPA: Para empezar, cree una interfaz que extienda `JpaRepository` y especifique la clase de entidad y el tipo de datos de clave primaria. Por ejemplo:

    ```java
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.example.domain.User;

    public interface UserRepository extends JpaRepository<User, Long> {
    }
    ```

   2. Define el nombre del método: A continuación, puedes definir el nombre del método en función de la consulta que desees realizar. Existen varias convenciones que sigue JPA para determinar la consulta que se va a ejecutar, como palabras clave como `findBy`, `readBy`, `queryBy`, `countBy` y `deleteBy`, seguidas del nombre de las propiedades de la entidad. Por ejemplo, para encontrar todos los usuarios con un nombre específico, puedes definir el nombre del método de la siguiente manera:

    ```java
    List<User> findByFirstName(String firstName);
    ```

   3. Inyectar el repositorio: Finalmente, puedes inyectar el repositorio en tu clase de servicio o componente y llamar a los métodos para realizar las operaciones de consulta.

    ```java
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsersByFirstName(String firstName) {
      return userRepository.findByFirstName(firstName);
    }
    ```

  **Nota**: La implementación exacta de los métodos de consulta derivados puede variar dependiendo de la implementación de JPA que esté utilizando (por ejemplo, Hibernate, EclipseLink, etc.). Sin embargo, el concepto básico de utilizar nombres de métodos para generar consultas sigue siendo el mismo.

</details>

<br>

 <details>    
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo puedo usar las anotaciones JPA "@OneToOne", "@OneToMany", "@ManyToOne", "@ManyToMany", "@JoinColumn" y "@JoinTable" en Java?</summary>    
    
<br> <!-- ✅ -->    
  La API de Persistencia de Java (JPA) proporciona varias anotaciones para mapear relaciones entre entidades en aplicaciones de Java. Estas anotaciones incluyen:    
    
 1. **@OneToOne**: Esta anotación se utiliza para definir una relación uno a uno entre dos entidades. El siguiente código muestra cómo usar la anotación `@OneToOne`:    
    
   ```java
   @Entity
   public class Employee {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     private String name;

     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "address_id", referencedColumnName = "id")
     private Address address;

     // Getters and setters ...
   }

   @Entity
   public class Address {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     private String street;

     private String city;

     // Getters and setters ...
   }
   ```

2. **@OneToMany & @ManyToOne**: Estas anotaciones se utilizan para definir relaciones uno a muchos y muchos a uno entre dos entidades.  
  
El siguiente código muestra cómo usar la anotación `@OneToMany` y la anotación `@ManyToOne`:  
  
   ```java
   @Entity
   public class Department {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     private String name;

     @OneToMany(mappedBy = "department")
     private List<Employee> employees;

     // Getters and setters ...
   }

   @Entity
   public class Employee {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     private String name;

     @ManyToOne
     @JoinColumn(name = "department_id", referencedColumnName = "id")
     private Department department;

     // Getters and setters ...
   }
   ```

3. **@ManyToMany & @JoinColumn & @JoinTable**: La anotación `@ManyToMany` se utiliza en Java para definir una relación muchos a muchos entre dos entidades. Esto significa que múltiples instancias de una entidad pueden estar relacionadas con múltiples instancias de otra entidad.  
  
La anotación `@JoinColumn` se utiliza en Java para especificar la columna de clave externa que se utilizará para unir las dos entidades. La columna de clave externa se utiliza para establecer una relación entre las entidades.  
  
La anotación `@JoinTable` se utiliza en Java para definir una tabla de unión para una relación muchos a muchos. La tabla de unión se utiliza para almacenar la información de la relación entre las dos entidades.  
  
El siguiente código muestra cómo usar las anotaciones `@ManyToMany`, `@JoinColumn` y `@JoinTable`:  
  
   ```java
   @Entity
   public class User {

       @ManyToMany
       @JoinTable(name = "user_role",
       joinColumns = @JoinColumn(name = "user_id"),
       inverseJoinColumns = @JoinColumn(name = "role_id"))
       private List<Role> roles;

   }

   @Entity
   public class Role {

       @ManyToMany(mappedBy = "roles")
       private List<User> users;

   }
   ```

</details>  

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es el propósito de utilizar las anotaciones "@RequiredArgsConstructor", "@AllArgsConstructor", "@NoArgsConstructor" y "@Data" en Java?</summary>

  <br> <!-- ✅ -->

  Estas son anotaciones en Java utilizadas para generar constructores para clases.

  - `@RequiredArgsConstructor`: genera un constructor con parámetros para campos finales o campos anotados con `@NonNull`.
  - `@AllArgsConstructor`: genera un constructor con parámetros para todos los campos de la clase.
  - `@NoArgsConstructor`: genera un constructor predeterminado sin parámetros.
  - `@Data`: combina las funcionalidades de las anotaciones `@ToString`, `@EqualsAndHashCode`, `@Getter` y `@Setter` en una sola anotación.

  Estas anotaciones se utilizan para reducir el código boilerplate y hacer el código más conciso y legible. También ayudan a prevenir errores en la codificación al generar automáticamente los constructores y métodos necesarios.

  Para usar estas anotaciones en su código Java, primero debe importarlas desde la biblioteca `lombok`. Luego puede usar las anotaciones en la definición de su clase de la siguiente manera:

  ```java
  import lombok.AllArgsConstructor;
  import lombok.Data;
  import lombok.NoArgsConstructor;
  import lombok.RequiredArgsConstructor;

  @RequiredArgsConstructor
  @AllArgsConstructor
  @NoArgsConstructor
  @Data
  public class MyClass {
    private final String field1;
    private String field2;
  }
  ```

  En este ejemplo, las anotaciones se utilizan para generar un constructor con parámetros para campos finales, un constructor con parámetros para todos los campos y un constructor predeterminado sin parámetros. La anotación `@Data` también genera los métodos `toString`, equals y `hashCode` para la clase.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">No puedo enviar cambios a mi repositorio. ¿Qué debo hacer?</summary>

  <!-- ✅ -->

  Si no puedes enviar cambios a tu repositorio, aquí hay algunos pasos que puedes seguir:

  1. Verifica tu conexión a internet: Asegúrate de que tu conexión a internet sea estable y funcione.
  2. Verifica la URL de tu repositorio: Asegúrate de estar usando la URL correcta de tu repositorio para enviar tus cambios.
  3. Revisa tus credenciales de Git: Asegúrate de que tus credenciales de Git estén actualizadas y correctas. Puedes revisar tus credenciales usando el siguiente comando:

  ```bash
  git config --list
  ```

  4. Actualiza tu repositorio local: Antes de enviar cambios, asegúrate de que tu repositorio local esté actualizado con el repositorio remoto. Puedes actualizar tu repositorio local usando el siguiente comando:

  ```bash
  git fetch origin
  ```

  5. Revisa posibles conflictos: Si hay conflictos entre tu repositorio local y el repositorio remoto, resuélvelos antes de enviar cambios.
  6. Envía cambios: Una vez que hayas resuelto los conflictos y actualizado tu repositorio local, puedes intentar enviar cambios nuevamente usando el siguiente comando:

  ```bash
  git push origin <branch_name>
  ```

</details>