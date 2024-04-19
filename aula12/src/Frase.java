public class Frase {
  private String frase;
  private boolean agressiva;

  //métodos especiais
  public Frase(String frase, boolean agressiva) {
    this.setFrase(frase);
    this.setAgressiva(agressiva);
  }

  public void setFrase(String frase) {
    this.frase = frase;
  }

  public String getFrase() {
    return frase;
  }

  public void setAgressiva(boolean agressiva) {
    this.agressiva = agressiva;
  }

  public boolean getAgressiva() {
    return this.agressiva;
  }
}
