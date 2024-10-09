# Star Wars API - Consulta de Películas en Java

## Descripción del Proyecto

Este proyecto forma parte del curso de Alura ONE sobre Java, donde se aplican conocimientos en la integración con APIs externas, manejo de excepciones y creación de archivos JSON.

En este proyecto, desarrollamos una aplicación en Java que consulta la SWAPI (Star Wars API) para obtener información de las películas de Star Wars (Episodios del 1 al 6). La aplicación permite seleccionar una película, realiza una solicitud HTTP a la API y luego guarda la información recibida en un archivo JSON local.

## Objetivos del Proyecto

1. **Consumir APIs**: Aplicar conocimientos sobre cómo consumir una API en Java usando `HttpClient`.
2. **Manejo de Excepciones**: Controlar posibles errores durante la consulta a la API.
3. **Uso de Gson**: Utilizar la biblioteca Gson para convertir datos JSON a objetos Java y viceversa.
4. **Creación de Archivos JSON**: Generar un archivo JSON con la información obtenida de la API y almacenarla localmente.

## Funcionalidades

- El usuario puede elegir una película de la lista de episodios disponibles (1 al 6).
- La aplicación realiza una consulta a la API de Star Wars para obtener la información de la película seleccionada.
- Los datos de la película (título, episodio, director, productor, etc.) se guardan en un archivo JSON en el sistema local.
- Manejo de excepciones para errores en la conexión o en la obtención de datos.

## Clases Principales

- **Principal**: La clase principal que contiene el menú de interacción con el usuario.
- **ConsultaPelicula**: Clase que maneja la solicitud HTTP a la API de SWAPI y convierte la respuesta JSON a un objeto Java utilizando Gson.
- **GeneradorDeArchivo**: Clase encargada de crear y guardar el archivo JSON con la información de la película.
- **Pelicula**: Un record en Java que representa los datos de la película, como el título, episodio, director, productor y fecha de lanzamiento.

## Requisitos

- Java 11 o superior.
- Biblioteca Gson para la conversión de JSON a objetos Java. Puedes incluir la dependencia en tu archivo `pom.xml` si usas Maven, o descargarla manualmente.
- Acceso a Internet para realizar la consulta a la API.

## Instalación y Ejecución

1. **Clonar el repositorio**:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
