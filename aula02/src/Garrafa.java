public class Garrafa {
  String marca;
  int volume;
  String cor;
  boolean tampada;

  void tampar() {
    this.tampada = true;
  }

  void destampar() {
    this.tampada = false;
  }

  void beber() {
    if(this.tampada == true) {
      System.out.println("Não é possível beber");
    } else {
      System.out.println("Bebendo");
    }
  }

  void showStatus() {
    System.out.println("Marca: " + this.marca);
    System.out.println("Cor: " + this.cor);
    System.out.println("Volume: " + this.volume);
  }
}
