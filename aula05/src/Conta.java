public class Conta {
  public int numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;

  //Métodos especiais
  //constructor
  public Conta(String t) {
    this.setTipo(t);
    this.setSaldo(0.0f);
    this.setStatus(false);
    if(t == "CC") {
      this.setSaldo(50.0f);
    } else if (t == "CP") {
      this.setSaldo(150.0f);
    }
  }
  
  //getters e setters
  public void setNumConta(int n) {
    this.numConta = n;
  }

  public int getNumConta() {
    return this.numConta;
  }

  public void setTipo(String t) {
    this.tipo = t;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setDono(String d) {
    this.dono = d;
  }

  public String getDono() {
    return this.dono;
  }

  public void setSaldo(float s) {
    this.saldo = s;
  }

  public float getSaldo() {
    return this.saldo;
  }

  public void setStatus(boolean st) {
    this.status = st;
  }

  public boolean getStatus() {
    return this.status;
  }

  //métodos específicos
  public void abrirConta() {
    if(this.getStatus()) {
      System.out.println("Esta conta ja esta aberta!"
      );
    } else {
      this.setStatus(true);
      System.out.println("Conta aberta!");
    }
  }

  public void fecharConta() {
    if(this.getSaldo() > 0) {
      System.out.println("ERRO: Conta com saldo positivo");
    } else if (this.getSaldo() < 0) {
      System.out.println("ERRO: Conta com saldo negativo");
    } else {
      this.setStatus(false);
      System.out.println("Conta fechada!");
    }
  }

  public void depositar(float v) {
    if(!getStatus()) {
      System.out.println("ERRO: Conta esta fechada!");
    } else {
      this.setSaldo(getSaldo() + v);
      System.out.println("Deposito de: " + v + " realizado!");
      System.out.println("Saldo de: " + this.getSaldo());
    }
  }

  public void sacar(float v) {
    if(!getStatus()) {
      System.out.println("ERRO: Conta esta fechada!");
    } else {
      if(this.getSaldo() < 0) {
        System.out.println("Nao e possivel sacar, conta em debito");
      } else if (this.getSaldo() < v) {
        System.out.println("Nao e possivel sacar, saldo insuficiente");
      } else {
        this.setSaldo(getSaldo() - v);
        System.out.println("Saque de " + v + " realizado!");
        System.out.println("Saldo de: " + this.getSaldo());
      }
    }
  }

  public void pagMensal() {
    if(this.getTipo() == "CC") {
      this.setSaldo(getSaldo() - 25.0f);
      System.out.println("Saldo de " + this.getSaldo());
    } else if (this.getTipo() == "CP") {
      this.setSaldo(getSaldo() - 50.0f);
      System.out.println("Saldo de: " + this.getSaldo());
    }
  }

  public void showStatus() {
    System.out.println("Numero: " + this.getNumConta());
    System.out.println("Tipo: " + this.getTipo());
    System.out.println("Dono: " + this.getDono());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Status: " + this.getStatus());
  }
}