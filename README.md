Proyecto Star Wars API - Consulta de Películas en Java
Este proyecto forma parte del curso de Alura ONE sobre Java, donde se aplican conocimientos en la integración con APIs externas, manejo de excepciones y creación de archivos JSON.

Descripción del Proyecto
En este proyecto, desarrollamos una aplicación en Java que consulta la SWAPI (Star Wars API) para obtener información de las películas de Star Wars (Episodios del 1 al 6). La aplicación permite seleccionar una película, realiza una solicitud HTTP a la API, y luego guarda la información recibida en un archivo JSON local.

Objetivos del Proyecto
Aplicar conocimientos sobre cómo consumir una API en Java usando HttpClient.
Manejo de excepciones para controlar posibles errores durante la consulta a la API.
Uso de la biblioteca Gson para convertir los datos JSON a objetos Java y viceversa.
Crear un archivo JSON con la información obtenida de la API y almacenarla localmente.
Funcionalidades
El usuario puede elegir una película de la lista de episodios disponibles (1 al 6).
La aplicación realiza una consulta a la API de Star Wars para obtener la información de la película seleccionada.
Los datos de la película (título, episodio, director, productor, etc.) se guardan en un archivo JSON en el sistema local.
Manejo de excepciones para errores en la conexión o en la obtención de datos.
Clases Principales
Principal: La clase principal que contiene el menú de interacción con el usuario.
ConsultaPelicula: Clase que maneja la solicitud HTTP a la API de SWAPI y convierte la respuesta JSON a un objeto Java utilizando Gson.
GeneradorDeArchivo: Clase encargada de crear y guardar el archivo JSON con la información de la película.
Pelicula: Un record en Java que representa los datos de la película, como el título, episodio, director, productor, y fecha de lanzamiento.
Requisitos
Java 11 o superior.
Biblioteca Gson para la conversión de JSON a objetos Java.
Acceso a Internet para realizar la consulta a la API.
Instalación y Ejecución
Clonar el repositorio:

bash
Copy code
git clone <URL_DEL_REPOSITORIO>
Navegar al directorio del proyecto:

bash
Copy code
cd starswarsapiexercise
Compilar y ejecutar el proyecto:

bash
Copy code
javac Principal.java
java Principal
Elige una película del menú y el programa realizará la consulta a la API y guardará un archivo .json con los datos de la película.

Notas
Asegúrate de que tu conexión a Internet esté activa para poder realizar las consultas a la API de SWAPI.
El archivo JSON se guardará en el mismo directorio donde se ejecuta la aplicación con el nombre del título de la película.
Créditos
Este proyecto fue desarrollado como parte del curso de Java - Alura ONE con el objetivo de aprender a:

Consumir APIs desde Java.
Manejar excepciones.
Crear y guardar archivos JSON.
