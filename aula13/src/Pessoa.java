public abstract class Pessoa {
  protected String nome;
  protected int idade;
  protected String sexo;
  protected float experiencia;

  //métodos específicos
  protected void ganharExperiencia(float newExp) {
    setExperiencia(getExperiencia()+ newExp);
  }

  //métodos especiais
  public Pessoa(String nome, int idade, String sexo) {
    this.setNome(nome);
    this.setIdade(idade);
    this.setSexo(sexo);
    this.setExperiencia(0f);
  }
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public float getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(float experiencia) {
    this.experiencia = experiencia;
  }

  @Override
  public String toString() {
    return "pessoa{" + "nome=" + this.nome + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + ", experiencia=" + this.getExperiencia();
  }
}