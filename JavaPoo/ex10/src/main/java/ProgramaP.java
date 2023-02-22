public class ProgramaP {
    public static void main(String[] args) {
        Linha l = new Linha("\n\n*******************************");
        Bolsista b1 = new Bolsista();
        b1.setNome("Flavio Da Silva");
        b1.setBolsa(70);
        b1.renovarBolsa();
        b1.pagarMensalidade();
        l.linhas();
        //System.out.println("\n\n=======================");
        Pessoa p1 = new Aluno();
        p1.setNome("Zé");
        p1.setSexo("M");
        p1.setIdade(28);
        System.out.println(p1.toString());
        l.linhas();
    }
}
