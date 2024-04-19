public class Ave extends Animal {
  private String corDaPena;

  //métodos específicos
  public void fazerNinho() {
    System.out.println("Fazendo ninho");
  }
  
  @Override
  public void locomover() {
    System.out.println("Voando");
  }

  @Override
  public void alimentar() {
    System.out.println("Comendo frutas");
  }

  @Override
  public void emitirSom() {
    System.out.println("Som de ave(canto)");
  }
  
  //métodos especiais
  public String getCorDaPena() {
    return corDaPena;
  }

  public void setCorDaPena(String corDaPena) {
    this.corDaPena = corDaPena;
  }
}
