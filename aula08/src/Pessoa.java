public class Pessoa {
  private String nome;
  private int idade;
  private String sexo;

//métodos específicos
  public void fazerNiver() {
    setIdade(getIdade() + 1);
  }

//métodos especiais
  public Pessoa(String nome, int idade, String sexo) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
  }

  public void setNome(String n) {
    this.nome = n;
  }

  public String getNome() {
    return this.nome;
  }

  public void setIdade(int i) {
    this.idade = i;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setSexo(String s) {
    this.sexo = s;
  }

  public String getSexo() {
    return this.sexo;
  }
}
