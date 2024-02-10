public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro("Buddy", "Golden Retriever");
        Animal gato = new Gato("Whiskers", "Persian");
        Animal leon = new Leon("Simba", "African Lion");

        System.out.println(perro);
        System.out.println(gato);
        System.out.println(leon);
    }
}