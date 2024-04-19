public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Alejandro");
        p2.setNome("Miguel");
        p3.setNome("Juscelino");
        p4.setNome("Jose");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        p3.setSalario(2500.0f);
        p3.receberAumento(250.0f);
        System.out.println(p3.getSalario());

        p4.setSetor("Secrataria");
        p4.mudarTrabalho("Financeiro");
        System.out.println(p4.getSetor());
    }
}
