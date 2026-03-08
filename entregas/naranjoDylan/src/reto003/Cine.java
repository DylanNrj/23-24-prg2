
/**
 * Representa un cine con ubicación, salas y cartelera de películas.
 * Gestiona la venta de tickets para las películas en cartelera.
 */
class Cine {

    private static final String SEPARADOR_PELICULAS = "------------------------";
    
    private final String nombre;
    private final String ubicacion;
    private final int salas;
    private Pelicula[] cartelera;

    public Cine(String nombre, String ubicacion, int salas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.salas = salas;
        this.cartelera = new Pelicula[0];
    }

    public void actualizarCartelera(Pelicula... peliculas) {
        this.cartelera = peliculas;
    }

    public void mostrarCartelera() {
        System.out.println(
            String.format("Cine: %s | Ubicacion: %s | Salas: %d", nombre, ubicacion, salas)
        );
        System.out.println("Cartelera:");
        for (Pelicula pelicula : cartelera) {
            pelicula.mostrarFicha();
            System.out.println(SEPARADOR_PELICULAS);
        }
    }

    public Ticket venderTicket(Pelicula pelicula, Visitante visitante) {
        System.out.println(
            String.format("[ACCION] Vendiendo ticket para '%s' a %s", 
                pelicula.getNombre(), visitante.getNombre())
        );
        return new Ticket(pelicula, visitante);
    }
}
