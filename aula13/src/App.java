public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        v[0] = new Video("Harry Potter e a Camara Secreta");
        v[1] = new Video("Harry Potter e o Prisioneiro de Azkaban");
        v[2] = new Video("Harry Potter e o Enigma do Principe");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jose", 23, "M", "jose@gmail.com");
        g[1] = new Gafanhoto("Maria", 19, "F", "maria@outlook.com");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0].getVideo().like();
        //System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(91.0f);
        System.out.println(vis[1].toString());

    }
}
