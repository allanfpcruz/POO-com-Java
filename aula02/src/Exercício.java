public class Exercício {
  String tipo;
  String data;
  int quantidade;
  float descanso;
  boolean estaDescansando;

  void showStatus() {
    System.out.println("Exercício de: " + this.tipo);
    System.out.println("Dia: " + this.data);
    System.out.println("Quantidade de exercícios: " + this.quantidade);
    System.out.println("Tempo de descanso: " + this.descanso);
  }

  void exercitar() {
    if (this.estaDescansando == true) {
      System.out.println("Não é possível exercitar");
    } else {
      System.out.println("Exercitando");
    }
  }
}
