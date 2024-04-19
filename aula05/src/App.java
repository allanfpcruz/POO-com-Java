public class App {
    public static void main(String[] args) throws Exception {
        Conta conta1 = new Conta("CP");
        conta1.setNumConta(1234);
        conta1.setDono("Allan");
        conta1.abrirConta();
        conta1.depositar(300.0f);
        conta1.sacar(450.0f);
        conta1.pagMensal();
        conta1.depositar(50.0f);
        conta1.fecharConta();
    }
}
