public abstract class Animal {
  private float peso;
  private int idade;
  private int membros;

  //métodos específicos
  public abstract void locomover();
  public abstract void alimentar();
  public abstract void emitirSom();

  //métodos especiais
  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public int getMembros() {
    return membros;
  }

  public void setMembros(int membros) {
    this.membros = membros;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}