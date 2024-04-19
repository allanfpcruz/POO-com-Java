//visibilidade de parâmetros e métodos
public class App {
    public static void main(String[] args) throws Exception {
        
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "BIC";
        caneta1.cor = "Azul";
        //caneta1.ponta = 0.7f;
        caneta1.carga = 50;
        //caneta1.tampada = true;
        caneta1.destampar();
        caneta1.status();
        caneta1.rabiscar();
    }
}
