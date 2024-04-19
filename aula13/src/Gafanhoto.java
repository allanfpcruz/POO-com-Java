public class Gafanhoto extends Pessoa {
  private String login;
  private int totAssistido;

  //métodos específicos
  public void viuMaisUm() {
    this.setTotAssistido(getTotAssistido() + 1);
    this.ganharExperiencia(1);
  }

  //métodos especiais
  public Gafanhoto(String nome, int idade, String sexo, String login) {
    super(nome, idade, sexo);
    this.setLogin(login);
    this.setTotAssistido(0);
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public int getTotAssistido() {
    return totAssistido;
  }

  public void setTotAssistido(int totAssistido) {
    this.totAssistido = totAssistido;
  }

  @Override
  public String toString() {
    return "gafanhoto{" + super.toString() + "}" + "\n login=" + this.getLogin() + ", total assistido=" + this.getTotAssistido() + "}";
  }
}