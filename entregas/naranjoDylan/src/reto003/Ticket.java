
class Ticket {

    private String estado;
    private final Pelicula pelicula;
    private final Visitante visitante;

    public Ticket(Pelicula pelicula, Visitante visitante) {
        this.pelicula = pelicula;
        this.visitante = visitante;
        this.estado = "Emitido";
    }

    public void mostrarEstado() {
        System.out.println(
            String.format("[INFO] Estado del ticket de %s para '%s': %s", 
                visitante.getNombre(), pelicula.getNombre(), estado)
        );
    }

    public void marcarComoResuelto() {
        estado = "Resuelto";
    }
}
