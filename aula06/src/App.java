public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto controle1 = new ControleRemoto();
        controle1.ligar();
        controle1.play();
        controle1.menosVolume();
        controle1.abrirMenu();
    }
}
