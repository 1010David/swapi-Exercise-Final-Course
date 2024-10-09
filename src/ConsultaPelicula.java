import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPelicula {

    // Método que busca información de una película de Star Wars a través de su número de episodio.
    public Pelicula buscaPelicula (int numeroPelicula) {
        // Construye una URI (Uniform Resource Identifier) con el número de la película para realizar la solicitud a la API
        URI direccion = URI.create("https://swapi.dev/api/films/" + numeroPelicula);

        // Crea un nuevo cliente HTTP que se encargará de hacer la solicitud.
        HttpClient client = HttpClient.newHttpClient();

        // Construye una solicitud HTTP con la URI de la película.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion) // Establece la URI que se usará en la solicitud.
                .build(); // Construye la solicitud.

        // Define una variable para almacenar la respuesta HTTP.
        HttpResponse<String> response;

        try {
            // Envía la solicitud HTTP y recibe la respuesta en formato String.
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString()); // La respuesta se maneja como un string
        } catch (Exception e) {
            // Si ocurre un error durante la solicitud (por ejemplo, la película no existe), lanza una excepción.
            throw new RuntimeException("Pelíucla no encotnrada");
        }

        // Imprime la respuesta para verificar el contenido
        //System.out.println("Respuesta de la API: " + response.body());

        // Usa Gson para deserializar la respuesta
        return new Gson().fromJson(response.body(), Pelicula.class);
    }

}
