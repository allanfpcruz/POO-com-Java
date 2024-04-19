public final class Bolsista extends Aluno {
  private float bolsa;

  //métodos específicos
  public void renovarBolsa() {
    System.out.println("Bolsa renovada!");
  }

  @Override
  public void pagarMensalidade() {
    float novaMensalidade = this.getMensalidade() - this.getBolsa();
    System.out.println("Mensalidade paga no valor de: " + novaMensalidade);
  }

  //métodos especiais
  public float getBolsa() {
    return bolsa;
  }

  public void setBolsa(float bolsa) {
    this.bolsa = bolsa;
  }
}
