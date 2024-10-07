public class Principal {

    public static void main(String[] args) {

        ConsultaPelicula consulta = new ConsultaPelicula();
        Pelicula pelicula = consulta.buscaPelicula(1);  // Puedes cambiar el número para probar con otras películas
        System.out.println(pelicula);

    }
}