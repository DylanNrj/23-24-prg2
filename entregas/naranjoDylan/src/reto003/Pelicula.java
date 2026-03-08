
import java.util.Random;

/**
 * Representa una película con nombre y género.
 * Permite selección aleatoria de películas desde un conjunto.
 */
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
        System.out.println(String.format("Pelicula: %s", nombre));
        System.out.println(String.format("Genero: %s", genero));
    }

    /**
     * Selecciona una película aleatoria del conjunto proporcionado.
     * Util para simulaciones de selección automática de películas.
     * 
     * @param peliculas Array de películas disponibles
     * @return Película seleccionada aleatoriamente
     * @throws IllegalArgumentException si no hay películas disponibles
     */
    public static Pelicula seleccionarPeliculaAleatoria(Pelicula... peliculas) {
        if (peliculas == null || peliculas.length == 0) {
            throw new IllegalArgumentException("Debe haber al menos una pelicula en cartelera.");
        }
        int indice = RANDOM.nextInt(peliculas.length);
        return peliculas[indice];
    }
}
