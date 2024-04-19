public class Cachorro extends Lobo {
  @Override
  public void emitirSom() {
    System.out.println("Au! Au! Au!");
  }

  public void reagir(Frase frase) {
    if(frase.getAgressiva()) {
      System.out.println("Reagiu a: " + frase.getFrase() + " com: Rosnando");
    } else {
      System.out.println("Reagiu a: " + frase.getFrase() + " com: Abanando rabo");
    }
  }

  public void reagir(int hora) {
    if(hora < 12) {
      System.out.println("Abanando rabo");
    } else if(hora >= 12 && hora <= 18) {
      System.out.println("Abanando rabo e latindo");
    } else if(hora > 18) {
      System.out.println("Ignorando");
    }
  }

  public void reagir(boolean dono) {
    if(dono) {
      System.out.println("Abanando rabo");
    } else {
      System.out.println("Rosnando");
    }
  }

  public void reagir(int idade, float peso) {
    if(idade < 5) {
      if(peso < 10) {
        System.out.println("Abanar");
      } else {
        System.out.println("Latir");
      }
    } else {
      if(peso < 10) {
        System.out.println("Rosnar");
      } else {
        System.out.println("Ignorar");
      }
    }
  }
}
