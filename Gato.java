public class Gato extends Animal {
     String raza;

    /** Constructor con nombre, raza y superclase */
    public Gato(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    /** Calcula el número de patas de un gato */
    @Override
    public int patas() {
        return 4;
    }

    /** Verifica si un gato es doméstico o no */
    @Override
    public boolean esDomestico() {
        return true;
    }

    /** Devuelve una representación de la cadena del gato. */
    @Override
    public String toString() {
        return "\nGATO: \n NOMBRE = " + nombre + " \n RAZA = " + raza ;
    }
}