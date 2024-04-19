public class ControleRemoto implements Controlador {
  private int volume;
  private boolean ligado;
  private boolean tocando;

  //métodos especiais
  public ControleRemoto() {
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
  }

  private void setVolume(int v) {
    this.volume = v;
  }

  private int getVolume() {
    return this.volume;
  }

  private void setLigado(boolean l) {
    this.ligado = l;
  }

  private boolean getLigado() {
    return this.ligado;
  }

  private void setTocando(boolean t) {
    this.tocando = t;
  }

  private boolean getTocando() {
    return this.tocando;
  }

  //métodos abstratos
  @Override
  public void ligar() {
    this.setLigado(true);
  }

  @Override
  public void desligar() {
    this.setLigado(false);
  }

  @Override
  public void abrirMenu() {
    System.out.println("------MENU------");
    System.out.println("Esta ligado: " + this.getLigado());
    System.out.println("Esta tocando: " + this.getTocando());
    System.out.println("Volume: " + this.getVolume());
  }

  @Override
  public void fecharMenu() {
    System.out.println("Fechando menu...");
  }

  @Override
  public void maisVolume() {
    if (this.getLigado() && this.getVolume() < 100) {
      this.setVolume(this.getVolume() + 10);
      System.out.println("Volume: " + this.getVolume());
    }
  }

  @Override
  public void menosVolume() {
    if(this.getLigado() && this.getVolume() > 0) {
      this.setVolume(getVolume() - 10);
      System.out.println("Volume: " + this.getVolume());
    }
  }

  @Override
  public void ligarMudo(){
    if(this.getLigado() && this.getVolume() > 0) {
      this.setVolume(0);
      System.out.println("Mudo");
    }
  }

  @Override
  public void desligarMudo() {
    if(this.getLigado() && this.getVolume() == 0) {
      this.setVolume(50);
      System.out.println("Desmutado");
    }
  }

  @Override
  public void play() {
    if(this.getLigado()) {
      this.setTocando(true);
      System.out.println("Tocando...");
    }
  }

  @Override
  public void pause() {
    if(this.getLigado()) {
      this.setLigado(false);
      System.out.println("Pausado");
    }
  }
}
