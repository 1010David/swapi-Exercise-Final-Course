// Definición de un record llamado Pelicula que representa una película de Star Wars.
public record Pelicula (
        // Título de la película.
        String title,

        // ID del episodio (número de la película en la saga).
        int episode_id,

        // Texto de apertura (opening crawl) que se muestra al inicio de la película.
        String opening_crawl,

        // Nombre del director de la película.
        String director,

        // Nombre del productor de la película.
        String producer,

        // Fecha de lanzamiento de la película.
        String release_date
) {
}
