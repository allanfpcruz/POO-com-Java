public class Lutador {
  //atributos
  private String nome;
  private String nacionalidade;
  private int idade;
  private float altura;
  private float peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empates;
  
  //métodos específicos
  public void apresentar() {
    System.out.println("Lutador: " + this.getNome());
    System.out.println("Nacionalidade: " + this.getNation());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Altura: " + this.getAltura());
    System.out.println("Peso: " + this.getPeso());
    System.out.println("Categoria: " + this.getCategoria());
    System.out.println("Vitorias: " + this.getVitorias());
    System.out.println("Derrotas: " + this.getDerrotas());
    System.out.println("Empates: " + this.getEmpates());
  }

  public void status() {
    System.out.println("Lutador " + this.getNome() + " categoria " + this.getCategoria() + " esta com " + this.getVitorias() + " vitorias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates.");
  }

  public void ganharLuta() {
    setVitorias(getVitorias() + 1);
  }

  public void perderLuta() {
    setDerrotas(getDerrotas() + 1);
  }

  public void empatarLuta() {
    setEmpates(getEmpates() + 1);
  }

  //métodos especiais
  public Lutador(String no, String nac, int id, float f, float g, int v, int d, int e) {
    this.setNome(no);
    this.setNation(nac);
    this.setIdade(id);
    this.setAltura(f);
    this.setPeso(g);
    this.setVitorias(v);
    this.setDerrotas(d);
    this.setEmpates(e);
  }

  public void setNome(String no) {
    this.nome = no; 
  } 

  public String getNome() {
    return this.nome;
  }

  public void setNation(String na) {
    this.nacionalidade = na;
  }

  public String getNation() {
    return this.nacionalidade;
  }

  public void setIdade(int id) {
    this.idade = id;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setAltura(float al) {
    this.altura = al;
  }

  public float getAltura() {
    return this.altura;
  }

  public void setPeso(float pe) {
    this.peso = pe;
    this.setCategoria();
  }

  public float getPeso() {
    return this.peso;
  }

  public void setCategoria() {
    if(getPeso() < 52.2) {
      this.categoria = "Invalido";
    } else if (getPeso() <= 70.3) {
      this.categoria = "Leve";
    } else if (getPeso() <= 83.9) {
      this.categoria = "Médio";
    } else if (getPeso() <= 120.2) {
      this.categoria = "Pesado";
    } else {
      this.categoria = "Invalido";
    }
  }

  public String getCategoria() {
    return this.categoria;
  }

  public void setVitorias(int v) {
    this.vitorias = v;
  }

  public int getVitorias() {
    return this.vitorias;
  }

  public void setDerrotas(int d) {
    this.derrotas = d;
  }

  public int getDerrotas() {
    return this.derrotas;
  }

  public void setEmpates(int e) {
    this.empates = e;
  }

  public int getEmpates() {
    return this.empates;
  }

}