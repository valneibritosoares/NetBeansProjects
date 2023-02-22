
package com.mycompany.ex05;

public class Conta {

    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    public Conta() {
        this.saldo = 0;
        this.status = false;
        this.dono = "";
        this.tipo = "";
    }

    public void mostraConta() {
        System.out.println("==========================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$ " + this.getSaldo() + ",00");
        if (this.getStatus()) {
            System.out.println("Status: Conta Aberta.");
        } else {
            System.out.println("Status: Conta Fechada.");
        }
    }

    public void abrirConta(String t) {
        this.setStatus(true);
        if ("cc".equals(t)) {
            this.setSaldo(50);
            this.setTipo("Conta-Corrente");
            System.out.println("==========================");
            System.out.println("Conta-Corrente aberta com sucesso.");
        } else if ("cp".equals(t)) {
            this.setSaldo(150);
            this.setTipo("Conta-Poupança");
            System.out.println("==========================");
            System.out.println("Conta-Poupança aberta com sucesso.");
        }

    }

    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.setSaldo(0);
            this.setStatus(false);
            this.setDono("**********"); 
           this.setTipo("(Encerada)");
            System.out.println("Conta fechada com sucesso.");
        } else if (this.saldo > 0) {
            System.out.println("A conta tem valor, não pode ser fechada.");

        } else {
            System.out.println("A conta negativa, não pode ser fechada.");

        }
    }

    public void depositar(int valor) {
        if (this.status == true) {
            setSaldo(getSaldo() + valor);
            System.out.println("Deposito de R$ " + valor + ",00. Realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar na conta fechada...");
        }

    }

    public void sacar(int valor) {
        if (this.getStatus() == true) {
            if (this.saldo >= valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque de R$ " + valor + ",00. Realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente na conta. Para saque de R$ " + valor + ",00.");
            }
        } else {
            System.out.println("Impossível sacar na conta fechada...");
        }

    }

    public void pagarMensal() {
        int v = 0;
        if ("cc".equals(getTipo())) {
            v = 12;
        } else if ("cp".equals(getTipo())) {
            v = 20;
        }
        if (getStatus()) {
            if (saldo > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mansalidade de R$ " + v + ",00. Paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível pagar na conta fechada...");
        }
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
