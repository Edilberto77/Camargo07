public class Leon extends Animal {
     String raza;

    public Leon(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public int patas() {
        return 4;
    }

    @Override
    public boolean esDomestico() {
        return false;
    }

    @Override
    public String toString() {
        return "\nLEON: \n NOMBRE = " + nombre + " \n RAZA = " + raza ;
    }
}