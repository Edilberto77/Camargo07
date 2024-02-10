public abstract class Animal {
     String nombre;

    /** Constructor con nombre */
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /** Calcula el número de patas de un animal */
    abstract public int patas();

    /** Indica si el animal es doméstico o no */
    abstract public boolean esDomestico();

    /** Devuelve una representación de la cadena del animal. */
    @Override
    public String toString() {
        return "ANIMAL [NOMBRE=" + nombre + "]";
    }
}