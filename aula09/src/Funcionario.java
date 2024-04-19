public class Funcionario extends Pessoa {
  private String setor;
  private boolean trabalhando;

  //métodos específicos
  public void mudarTrabalho(String novoSetor) {
    this.setSetor(novoSetor);
  }

  //métodos especiais
  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public boolean getTrabalhando() {
    return this.trabalhando;
  }

  public void setTrabalhando(boolean trabalhando) {
    this.trabalhando = trabalhando;
  }
}
