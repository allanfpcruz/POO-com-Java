public class Reptil extends Animal {
  private String corDaEscama;

  //métodos específicos
  @Override
  public void locomover() {
    System.out.println("Rastejando");
  }

  @Override
  public void alimentar() {
    System.out.println("Comendo");
  }

  @Override
  public void emitirSom() {
    System.out.println("Som de reptil");
  }
  
  //métodos especiais
  public String getCorDaEscama() {
    return corDaEscama;
  }

  public void setCorDaEscama(String corDaEscama) {
    this.corDaEscama = corDaEscama;
  }

}
