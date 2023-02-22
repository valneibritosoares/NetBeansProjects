
package com.mycompany.aula04;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private  int carga;
    private boolean tampada;

    public Caneta() {
        //METODO CONSTRUTOR SEM PARAMENTRO
        this.modelo = "Bic extra";
        this.cor = "Vermalho";
        this.ponta = 1.5f;
        this.carga = 95;
        this.tampada = true;
    }
    
    public Caneta(String mod, String cor, float pon, int carga, boolean tampa) {
        //METODO CONSTRUTOR COM PARAMENTRO
        this.modelo = mod;
        this.cor = cor;
        this.ponta = pon;
        this.carga = carga;
        this.tampada = tampa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Nivel de carga: " + this.carga + "%");
        System.out.println("Tampado: " + this.tampada);
        System.out.println("====================================");
    }
    
}
  

