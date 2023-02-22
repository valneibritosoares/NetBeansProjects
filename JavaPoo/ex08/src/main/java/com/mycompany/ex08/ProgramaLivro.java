package com.mycompany.ex08;
public class ProgramaLivro {
    public static void main(String[] args) {
      Pessoa[] p = new Pessoa[2];
      Livro[] l = new Livro[3];
      
      p[0] = new Pessoa("Pedro", 22, "M");
      p[1] = new Pessoa("Maria", 25, "F");
      p[1].fazerAniver();
      p[0].fazerAniver();
      p[1].fazerAniver();
      
      
      
      l[0] = new Livro("Aprendedo Java", "José da Silva", 300, p[0]);
      l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
      l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
      l[1].abrir();
      l[1].folhear(90);
      l[1].avançarPag();
      l[1].voltarPag();
      l[1].fecha();
      
      System.out.println("=============================");
      System.out.println(l[0].detalhes());
      System.out.println("=============================");
      System.out.println("=============================");
      System.out.println(l[1].detalhes());
      System.out.println("=============================");
      
    }
    
}
