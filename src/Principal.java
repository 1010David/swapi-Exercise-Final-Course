import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Cúal será la película: ");

        try {
            var nuemroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consulta.buscaPelicula(nuemroDePelicula);  // Puedes cambiar el número para probar con otras películas
            System.out.println(pelicula);
            GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();
            generadorDeArchivo.guardarJson(pelicula);
        } catch (NumberFormatException e){
            System.out.println("Npumero no encontrado "+e.getMessage());
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la app.");
        }

    }
}