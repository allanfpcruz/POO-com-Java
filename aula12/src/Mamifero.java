public class Mamifero extends Animal {
  private String corDoPelo;

  //métodos específicos
  @Override
  public void emitirSom() {
    System.out.println("Som de mamifero");
  }
  //métodos especiais
  public String getCorDoPelo() {
    return corDoPelo;
  }

  public void setCorDoPelo(String corDoPelo) {
    this.corDoPelo = corDoPelo;
  }
}
