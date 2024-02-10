public abstract class Animal {
     String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    abstract public int patas();

    abstract public boolean esDomestico();

    @Override
    public String toString() {
        return "ANIMAL [NOMBRE=" + nombre + "]";
    }
}