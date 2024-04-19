public class Aluno extends Pessoa {
  private int matricula;
  private String curso;
  private float mensalidade;

  //métodos específicos
  public void pagarMensalidade() {
    System.out.println("Mensalidade paga no valor de: " + this.getMensalidade());
  }

  //métodos especiais
  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public float getMensalidade() {
    return mensalidade;
  }

  public void setMensalidade(float mensalidade) {
    this.mensalidade = mensalidade;
  }
}
