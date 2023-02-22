
public final class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitoria, derrota, empate;
    private float altura, peso;
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
    }

    public void apresentar() {
        System.out.println("======== LUTADOR ========");
        System.out.println("=========================");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitória: " + this.getVitoria());
        System.out.println("Derrota: " + this.getDerrota());
        System.out.println("Empate: " + this.getEmpate());
        System.out.println("__________________________");
        System.out.println(" ");
    }

    public void status() {
        System.out.println("==== STATUS DO LUTADOR ====");
        System.out.println("===========================");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Vitória: " + this.getVitoria());
        System.out.println("Derrota: " + this.getDerrota());
        System.out.println("Empate: " + this.getEmpate());
        System.out.println("____________________________");
        System.out.println(" ");
    }

    public void ganharLuta() {
        this.setVitoria(this.getVitoria() + 1);
    }

    public void perderLuta() {
        this.setDerrota(this.getDerrota() + 1);
    }

    public void empatarLuta() {
        this.setEmpate(this.getEmpate() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

}
