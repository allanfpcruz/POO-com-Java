public class Aluno extends Pessoa {
  private int matricula;
  private String curso;

  //métodos específicos
  public void cancelMatricula() {
    System.out.println("MATRICULA CANCELADA!");
  }

  //métodos específicos
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
  
}
