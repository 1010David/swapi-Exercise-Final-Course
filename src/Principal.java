// Importa la clase IOException para manejar excepciones relacionadas con entradas/salidas.
import java.io.IOException;
// Importa la clase Scanner para leer la entrada del usuario.
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada desde la consola.
        Scanner lectura = new Scanner(System.in);

        // Crea una instancia de ConsultaPelicula para realizar consultas a la API.
        ConsultaPelicula consulta = new ConsultaPelicula();

        // Solicita al usuario que ingrese el número de la película.
        System.out.println("Cúal será la película: ");

        try {
            // Lee la entrada del usuario y la convierte a un número entero.
            var nuemroDePelicula = Integer.valueOf(lectura.nextLine());

            // Busca la película correspondiente al número ingresado.
            Pelicula pelicula = consulta.buscaPelicula(nuemroDePelicula);  // Puedes cambiar el número para probar con otras películas

            // Imprime los detalles de la película en la consola.
            System.out.println(pelicula);

            // Crea una instancia de GeneradorDeArchivo para guardar la película en un archivo JSON.
            GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();
            // Guarda la información de la película en un archivo JSON.
            generadorDeArchivo.guardarJson(pelicula);
        } catch (NumberFormatException e) {
            // Captura el caso donde el usuario ingresa un valor que no se puede convertir a número.
            System.out.println("Npumero no encontrado " + e.getMessage());
        } catch (RuntimeException | IOException e) {
            // Captura excepciones relacionadas con la búsqueda de la película o la escritura del archivo.
            System.out.println(e.getMessage());
            // Mensaje de finalización de la aplicación en caso de error.
            System.out.println("Finalizando la app.");
        }

    }
}
