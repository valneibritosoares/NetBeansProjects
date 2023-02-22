package com.mycompany.ex12;
public class Aula12 {
    public static void main(String[] args) {
        Linha l = new Linha("################################");
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        v[1].play();
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", "M", 22, "Juba");
        g[1] = new Gafanhoto("Creuza", "F", 29, "Crer");
        
        Visualizacao vi[] = new Visualizacao[5];
        vi[0] = new Visualizacao(g[0], v[1]);
        vi[0].avalar(59.9f);
        System.out.println(vi[0].toString());
    }
    
}
