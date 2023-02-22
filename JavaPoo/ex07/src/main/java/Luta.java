
import java.util.Random;

public class Luta {
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador a1, Lutador a2, int r){
        if(a1.getCategoria().equals(a2.getCategoria())
                && a1 != a2){
            this.aprovada = true;
            this.desafiado = a1;
            this.desafiante = a2;
            this.rounds = r;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("####### DESAFIADO #######");
            this.desafiado.apresentar();
            System.out.println("###### DESAFIANTE #######");   
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int lutador1 = 0;
            lutador1 += this.desafiado.getVitoria() + this.desafiado.getAltura() + 
                    this.desafiado.getEmpate() + this.desafiado.getPeso() - 
                    this.desafiado.getDerrota() - this.desafiado.getIdade();
            int lutador2 = 0;
            lutador2 += this.desafiante.getVitoria() + this.desafiante.getAltura() + 
                    this.desafiante.getEmpate() + this.desafiante.getPeso() - 
                    this.desafiante.getDerrota() - this.desafiante.getIdade();
            for(int i = 0; i < this.rounds; i++){
                 lutador1+= aleatorio.nextInt(this.rounds);
                 lutador2+= aleatorio.nextInt(this.rounds);
            }
            System.out.println("==== Resultado da luta ====");
                if(lutador1 > lutador2) {
                    System.out.println("== Vitória de " + this.desafiado.getNome() + " ==");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                } else if(lutador1 < lutador2){
                    System.out.println("== Vitória de " + this.desafiante.getNome() + " ==");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                } else {
                     System.out.println("========= Empatou =========");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
            System.out.println(this.desafiado.getNome() + " Venceu " + lutador1 + " Rounds " );
            System.out.println(this.desafiante.getNome() + " Venceu " + lutador2 + " Rounds " );
            System.out.println("===========================");
            System.out.println("");
            this.desafiado.status();
            this.desafiante.status();
        } else {
            System.out.println("xxxx A luta não pode acontecer xxxx");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
