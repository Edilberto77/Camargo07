public class Leon extends Animal {
     String raza;

    /** Constructor con nombre, raza y superclase */
    public Leon(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    /** Calcula el número de patas de un león */
    @Override
    public int patas() {
        return 4;
    }

    /** Verifica si un león es doméstico o no */
    @Override
    public boolean esDomestico() {
        return false;
    }

    /** Devuelve una representación de la cadena del león. */
    @Override
    public String toString() {
        return "\nLEON: \n NOMBRE = " + nombre + " \n RAZA = " + raza ;
    }
}