
/**
 * Programa principal que simula el funcionamiento de un cine.
 * Demuestra la interacción entre Cine, Peliculas, Visitantes y Tickets.
 */
public class Reto003 {

    public static void main(String[] args) {
        Cine cine = new Cine("Cinesa", "El Corte Ingles", 5);

        Pelicula pelicula1 = new Pelicula("Kung Fu Panda 4", "Animacion/Accion");
        Pelicula pelicula2 = new Pelicula("Avengers: Endgame", "Accion/Aventura");
        Pelicula pelicula3 = new Pelicula("Godzilla y Kong: El nuevo imperio", "Ciencia Ficcion/Accion");

        cine.actualizarCartelera(pelicula1, pelicula2, pelicula3);
        cine.mostrarCartelera();

        Visitante visitante = new Visitante("Pedro");
        Pelicula peliculaSeleccionada = Pelicula.seleccionarPeliculaAleatoria(pelicula1, pelicula2, pelicula3);

        Ticket ticket = cine.venderTicket(peliculaSeleccionada, visitante);
        ticket.mostrarEstado();
        ticket.marcarComoResuelto();
        ticket.mostrarEstado();
    }
}
