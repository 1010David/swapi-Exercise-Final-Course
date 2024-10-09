import com.google.gson.Gson; // Importa la clase Gson para convertir objetos Java en JSON.
import com.google.gson.GsonBuilder; // Importa GsonBuilder para crear instancias de Gson con configuraciones personalizadas.

import java.io.FileWriter; // Importa la clase FileWriter para escribir en archivos.
import java.io.IOException; // Importa excepciones de manejo de errores de entrada/salida.

public class GeneradorDeArchivo {

    // Método que guarda un objeto Pelicula como un archivo JSON.
    public void guardarJson(Pelicula pelicula) throws IOException {
        // Crea una instancia de Gson con formato de impresión bonito (indenta el JSON).
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Crea un objeto FileWriter para escribir en un archivo JSON.
        // El nombre del archivo se basa en el título de la película.
        FileWriter escritura = new FileWriter(pelicula.title() + ".json");

        // Convierte el objeto pelicula en una cadena JSON y la escribe en el archivo.
        escritura.write(gson.toJson(pelicula));

        // Cierra el FileWriter para liberar los recursos asociados con el archivo.
        escritura.close();
    }

}
