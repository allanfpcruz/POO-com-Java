public class Livro implements Publicacao {
  private String titulo;
  private String autor;
  private int totPaginas;
  private int paginaAtual;
  private boolean aberto;
  private Pessoa leitor;

  //métodos específicos
  public void detalhes() {
    System.out.println("Livro: " + this.getTitulo());
    System.out.println("Autor: " + this.getAutor());
    System.out.println("Total de paginas: " + this.getTotPaginas());
    System.out.println("Pagina atual: " + this.getPaginaAtual());
    System.out.println("Esta aberto? " + this.getAberto());
    System.out.println("Leitor: " + this.getLeitor().getNome());
  }

  public void apresentarLeitor() {
    System.out.println(this.getLeitor().getNome() + " esta lendo " + this.getTitulo() + " de " + this.getAutor() + ", " + this.getLeitor().getNome() + " tem " + this.getLeitor().getIdade() + " anos.");
  }

  //métodos especiais

  public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
    this.titulo = titulo;
    this.autor = autor;
    this.totPaginas = totPaginas;
    this.aberto = false;
    this.paginaAtual = 0;
    this.leitor = leitor;
  }
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getTotPaginas() {
    return totPaginas;
  }

  public void setTotPaginas(int totPaginas) {
    this.totPaginas = totPaginas;
  }

  public int getPaginaAtual() {
    return this.paginaAtual;
  }

  public void setPaginaAtual(int paginaAtual) {
    this.paginaAtual = paginaAtual;
  }

  public boolean getAberto() {
    return this.aberto;
  }

  public void setAberto(boolean a) {
    this.aberto = a;
  }

  public Pessoa getLeitor() {
    return leitor;
  }

  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

  @Override
  public void abrir() {
    this.setAberto(true);
  }

  @Override
  public void fechar() {
    this.setAberto(false);
    this.setPaginaAtual(0);
  }

  @Override
  public void folhear() {
   this.setPaginaAtual(getTotPaginas());
  }

  @Override
  public void avancarPag(int p) {
    if(p > this.getTotPaginas()) {
      System.out.println("Impossivel avancar para esta pagina");
    } else if(!this.getAberto()) {
      System.out.println("ERRO: O livro esta fechado");
    } else {
      this.setPaginaAtual(p);
    }
  }

  @Override
  public void voltarPag(int p) {
    if(p > this.getPaginaAtual()) {
      System.out.println("Impossivel voltar para esta pagina");
    } else if(!this.getAberto()) {
      System.out.println("EROOR: O livro esta fechado");
    } else {
      this.setPaginaAtual(p);
    }
  }
}
