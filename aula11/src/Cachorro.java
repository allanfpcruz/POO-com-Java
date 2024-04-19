public class Cachorro extends Mamifero {
  //métodos específicos
  public void enterrarOsso() {
    System.out.println("Enterrando osso");
  }

  public void balancarRabo() {
    System.out.println("Balancando rabo");
  }

  @Override
  public void emitirSom() {
    System.out.println("Latindo");
  }
}
