public class Gato extends Animal {
     String raza;


    public Gato(String nombre, String raza) {
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
        return "\nGATO: \n NOMBRE = " + nombre + " \n RAZA = " + raza ;
    }
}