public class App {
    public static void main(String[] args) throws Exception {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Joao", 19, "M");
        p[1] = new Pessoa("Maria", 16, "F");

        l[0] = new Livro("Pequeno Principe", "Fulano", 250, p[1]);
        l[1] = new Livro("Chapeuzinho Vermelho", "Ciclano", 95, p[1]);
        l[2] = new Livro("Harry Potter", "JK Rowling", 350, p[0]);

        p[0].fazerNiver();

        l[2].abrir();
        l[2].avancarPag(30);

        l[2].voltarPag(15);
        l[2].detalhes();
        l[2].apresentarLeitor();
    }
}
