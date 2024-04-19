public class Video implements AcoesVideo {
  private String titulo;
  private float avaliacao;
  private int views;
  private int curtidas;
  private boolean reproduzindo;

  //métodos específicos
  @Override
  public void play() {
    if(getReproduzindo()) {
      System.out.println("O video ja esta sendo reproduzido, impossivel dar play!");
    } else {
      setReproduzindo(true);
      System.out.println("Video em reproducao");
    }
  }

  @Override
  public void pausar() {
    if(!getReproduzindo()) {
      System.out.println("O video ja esta pausado!");
    } else {
      setReproduzindo(false);
      System.out.println("Video pausado");
    }
  }

  @Override
  public void like() {
    setCurtidas(getCurtidas() + 1);
  }

  //métodos especiais
  public Video(String titulo) {
    this.setTitulo(titulo);
    this.setAvaliacao(1);
    this.setViews(0);
    this.setCurtidas(0);
    this.setReproduzindo(false);
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public float getAvaliacao() {
    return avaliacao;
  }

  public void setAvaliacao(float avaliacao) {
    this.avaliacao = avaliacao;
  }

  public int getViews() {
    return views;
  }

  public void setViews(int views) {
    this.views = views;
  }

  public int getCurtidas() {
    return curtidas;
  }

  public void setCurtidas(int curtidas) {
    this.curtidas = curtidas;
  }

  public boolean getReproduzindo() {
    return this.reproduzindo;
  }

  public void setReproduzindo(boolean reproduzindo) {
    this.reproduzindo = reproduzindo;
  }

  @Override
  public String toString() {
    return "video{" + "titulo=" + this.getTitulo() + ", avaliacao=" + this.getAvaliacao() + ", views=" + this.getViews() + ", curtidas=" + this.getCurtidas() + ", reproduzindo=" + this.getReproduzindo() + "}";
  }
}
