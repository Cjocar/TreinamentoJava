package org.example.contabancaria;

public class ContaBancaria {
    //Atributos privados
    private String titular;
    private double saldo;

    //Getter e Setter - Métodos padrões para acessar e modificar os atributos


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Construtor - Com atributos
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Construtor sem atributos
    public ContaBancaria(){
    }

    //Construtor com atributo
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    //Construtor que inicializa a conta bancaria com o saldo 0
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0;
    }
}




