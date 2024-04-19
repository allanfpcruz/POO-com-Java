public class App {
    public static void main(String[] args) throws Exception {
        Visitante v1 = new Visitante();
        v1.setNome("Jose");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Alejandro");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.setCurso("Engenharia");
        a1.setMensalidade(1000.0f);
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Melissa");
        b1.setIdade(17);
        b1.setSexo("F");
        b1.setCurso("Moda");
        b1.setMensalidade(750.0f);
        b1.setBolsa(500.0f);
        System.out.println(b1.toString());
        b1.pagarMensalidade();

    }
}
