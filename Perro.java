public class Perro extends Animal {
     String raza;

    /** Constructor con nombre, raza y superclase */
    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    /** Calcula el número de patas de un perro */
    @Override
    public int patas() {
        return 4;
    }

    /** Verifica si un perro es doméstico o no */
    @Override
    public boolean esDomestico() {
        return true;
    }

    /** Devuelve una representación de la cadena del perro. */
    @Override
    public String toString() {
        return "\nPERRO: \n NOMBRE = " + nombre + " \n RAZA = " + raza;
    }
}