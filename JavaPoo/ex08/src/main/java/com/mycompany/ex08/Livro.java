package com.mycompany.ex08;
public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public String detalhes() {
        return """
               Livro:
               Titulo: """ + titulo + "\nAutor: "
                + autor + "\nTotal de Paginas: " + totPaginas
                + "\nPagina Atual: " + pagAtual + "\nAberto:"
                + aberto + "\nNome do Leitor: " + leitor.getNome() +
                "\nIdade do Leitor: " + leitor.getIdade() +
                "\nSexo do Leitor: " + leitor.getSexo();
    }
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fecha() {
        this.aberto = false;
        this.pagAtual = 0;
    }

    @Override
    public void folhear(int p) {
        if(p <= this.totPaginas){
        this.pagAtual = p;
        }else{
            this.pagAtual = 0;
        }
    }

    @Override
    public void avançarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
    
}
