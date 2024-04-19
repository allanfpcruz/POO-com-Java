public class App {
    public static void main(String[] args) throws Exception {
        Cachorro c1 = new Cachorro();
        c1.setPeso(22.7f);
        c1.setIdade(5);
        c1.setMembros(4);
        c1.setCorDoPelo("Branca");
        c1.emitirSom();

        Frase frase1 = new Frase("Olha a comida", false);
        c1.reagir(frase1);

        Frase frase2 = new Frase("Sai daqui!", true);
        c1.reagir(frase2);

        c1.reagir(true);
        c1.reagir(false);
        c1.reagir(21);
        c1.reagir(14, 16);
    }
}
