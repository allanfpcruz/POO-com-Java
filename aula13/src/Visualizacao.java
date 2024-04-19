public class Visualizacao {
  private Gafanhoto espectador;
  private Video video;

  //métodos específicos

  //métodos especiais
  public Visualizacao(Gafanhoto espectador, Video video) {
    this.setEspectador(espectador);
    this.getEspectador().viuMaisUm();;
    this.setVideo(video);
    this.getVideo().setViews(this.getVideo().getViews() + 1);
  }

  public void avaliar() {
    this.getVideo().setAvaliacao(5);
  }

  public void avaliar(int nota) {
    this.getVideo().setAvaliacao(nota);
  }

  public void avaliar(float porc) {
    int tot = 0;
    if(porc <= 20) {
      tot = 3;
    } else if(porc <= 50) {
      tot = 5;
    } else if(porc <= 90) {
      tot = 8;
    } else {
      tot = 10;
    }
    this.getVideo().setAvaliacao(tot);
  }

  @Override
  public String toString() {
    return "Visualizacao{" + "espectador=" + this.getEspectador() + ", video=" + this.getVideo() + "}";
  }

  public Gafanhoto getEspectador() {
    return espectador;
  }

  public void setEspectador(Gafanhoto espectador) {
    this.espectador = espectador;
  }

  public Video getVideo() {
    return video;
  }

  public void setVideo(Video video) {
    this.video = video;
  }
}
