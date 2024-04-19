//classes e objetos
public class App {
    public static void main(String[] args) throws Exception {
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Bic";
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 50;
        caneta1.tampada = true;
        caneta1.tampar();
        caneta1.status();
        caneta1.rabiscar();

        System.out.println("-----------------------");

        Caneta caneta2 = new Caneta();
        caneta2.modelo = "Faber Castel";
        caneta2.cor = "Preta";
        caneta2.ponta = 0.7f;
        caneta2.carga = 90;
        caneta2.tampada = true;
        caneta2.destampar();
        caneta2.status();
        caneta2.rabiscar();

        System.out.println("-----------------------");

        Garrafa garrafa1 = new Garrafa();
        garrafa1.marca = "Stanley";
        garrafa1.volume = 750;
        garrafa1.cor = "Cinza";
        garrafa1.tampada = true;
        garrafa1.showStatus();
        garrafa1.beber();

        System.out.println("-----------------------");

        Exercício exercicio1 = new Exercício();
        exercicio1.tipo = "Superiores";
        exercicio1.data = "Segunda-feira";
        exercicio1.quantidade = 4;
        exercicio1.descanso = 2.5f;
        exercicio1.estaDescansando = false;
        exercicio1.showStatus();
        exercicio1.exercitar();

        System.out.println("-----------------------");

        Exercício exercicio2 = new Exercício();
        exercicio2.tipo = "Ineriores";
        exercicio2.data = "Quarta-feira";
        exercicio2.quantidade = 6;
        exercicio2.descanso = 4.5f;
        exercicio2.estaDescansando = true;
        exercicio2.showStatus();
        exercicio2.exercitar();
    }
}
