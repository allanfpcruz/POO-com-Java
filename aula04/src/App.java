public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta("BIC", "Preta", 0.8f);
        c1.status();
        Caneta c2 = new Caneta("Faber Castel", "Verde", 1.3f);
        c2.status();
    }
}
