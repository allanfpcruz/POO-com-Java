public class Peixe extends Animal {
  private String corDaEscama;

  //métodos específicos
  public void soltarBolha() {
    System.out.println("Soltando bolha");
  }

  @Override
  public void locomover() {
    System.out.println("Nadando");
  }

  @Override
  public void alimentar() {
    System.out.println("Comendo algas");
  }

  @Override
  public void emitirSom() {
    System.out.println("Peixe nao emite som");
  }
  
  //métodos especiais
  public String getCorDaEscama() {
    return corDaEscama;
  }

  public void setCorDaEscama(String corDaEscama) {
    this.corDaEscama = corDaEscama;
  }
}
