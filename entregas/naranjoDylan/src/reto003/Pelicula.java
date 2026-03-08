
import java.util.Random;

class Pelicula {

    private static final Random RANDOM = new Random();

    private final String nombre;
    private final String genero;

    public Pelicula(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarFicha() {
        System.out.println("Pelicula: " + nombre);
        System.out.println("Genero: " + genero);
    }

    public static Pelicula seleccionarPeliculaAleatoria(Pelicula... peliculas) {
        if (peliculas == null || peliculas.length == 0) {
            throw new IllegalArgumentException("Debe haber al menos una pelicula en cartelera.");
        }
        int indice = RANDOM.nextInt(peliculas.length);
        return peliculas[indice];
    }
}
