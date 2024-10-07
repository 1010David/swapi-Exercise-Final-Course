import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPelicula {

    Pelicula buscaPelicula (int numeroPelicula){

        URI direccion = URI.create("https://swapi.dev/api/films/"+numeroPelicula);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;

        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Imprime la respuesta para verificar el contenido
        System.out.println("Respuesta de la API: " + response.body());

        // Usa Gson para deserializar la respuesta
        return new Gson().fromJson(response.body(), Pelicula.class);
    }

}
