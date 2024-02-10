public class Perro extends Animal {
     String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public int patas() {
        return 4;
    }

    @Override
    public boolean esDomestico() {
        return true;
    }

    @Override
    public String toString() {
        return "\nPERRO: \n NOMBRE = " + nombre + " \n RAZA = " + raza;
    }
}