public class App {
    public static void main(String[] args) throws Exception {
        //Animmal a1 = new Animal();
        Mamifero m1 = new Mamifero();
        m1.setPeso(85.5f);
        m1.setMembros(4);
        m1.setIdade(4);
        m1.setCorDoPelo("Marrom");
        m1.alimentar();
        m1.emitirSom();
        m1.locomover();

        System.out.println("---------------------");

        Cachorro c1 = new Cachorro();
        c1.setPeso(22.7f);
        c1.setMembros(4);
        c1.setIdade(2);
        c1.setCorDoPelo("Preto");
        c1.alimentar();
        c1.emitirSom();
        c1.locomover();
        c1.balancarRabo();
        c1.enterrarOsso();

        System.out.println("---------------------");

        Canguru can1 = new Canguru();
        can1.setPeso(50.0f);
        can1.setMembros(4);
        can1.setIdade(10);
        can1.setCorDoPelo("Marrom");
        can1.alimentar();
        can1.emitirSom();
        can1.locomover();
        can1.usarBolsa();

        System.out.println("---------------------");

        Reptil r1 = new Reptil();
        r1.setPeso(0.0750f);
        r1.setMembros(4);
        r1.setIdade(1);
        r1.setCorDaEscama("Verde");
        r1.alimentar();
        r1.emitirSom();
        r1.locomover();

        System.out.println("-----------------------");

        Tartaruga t1 = new Tartaruga();
        t1.setPeso(250.0f);
        t1.setMembros(4);
        t1.setIdade(95);
        t1.setCorDaEscama("Verde");
        t1.alimentar();
        t1.emitirSom();
        t1.locomover();

        System.out.println("-----------------------");

        Nemo p1 = new Nemo();
        p1.setPeso(0.4f);
        p1.setMembros(0);
        p1.setIdade(1);
        p1.setCorDaEscama("Azul");
        p1.alimentar();
        p1.emitirSom();
        p1.locomover();
        p1.soltarBolha();

        System.out.println("-------------------");

        Arara a1 = new Arara();
        a1.setPeso(0.5f);
        a1.setMembros(2);
        a1.setIdade(4);
        a1.setCorDaPena("Vermelha");
        a1.alimentar();
        a1.emitirSom();
        a1.locomover();
        a1.fazerNinho();
    }
}
