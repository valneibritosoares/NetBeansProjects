
public class Bolsista extends Aluno {

    private int bolsa;

    public void renovarBolsa() {
        System.out.println("Bolsa renovada. Com " + getBolsa() + "% de desconto. ");
        //this.bolsa = 70;
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " É bolsista. Tem " + getBolsa() + "% de desconto. ");
    }
}
