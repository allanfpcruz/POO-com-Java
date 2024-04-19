public class Caneta {
  private String modelo;
  private String cor;
  private float ponta;
  private boolean tampada;

  //método construtor (deve usar o mesmo nome da classe)
  public Caneta(String m, String c, float p) {
    this.tampar();
    this.modelo = m;
    this.cor = c;
    this.ponta = p;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String m) {
    this.modelo = m;
  }

  public float getPonta() {
    return this.ponta;
  }

  public void setPonta(float p) {
    this.ponta = p;
  }

  public void status() {
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Cor: " + this.cor);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Esta tampada? " + this.tampada);
  }

  public void tampar() {
    this.tampada = true;
  }

  public void destampar() {
    this.tampada = false;
  }


}