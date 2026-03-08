
class Cine {

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
        System.out.println("Cine: " + nombre + " | Ubicacion: " + ubicacion + " | Salas: " + salas);
        System.out.println("Cartelera:");
        for (Pelicula pelicula : cartelera) {
            pelicula.mostrarFicha();
            System.out.println("------------------------");
        }
    }

    public Ticket venderTicket(Pelicula pelicula, Visitante visitante) {
        System.out.println("Vendiendo ticket para " + pelicula.getNombre() + " a " + visitante.getNombre());
        return new Ticket(pelicula, visitante);
    }
}
