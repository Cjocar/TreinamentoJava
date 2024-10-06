package org.example.contabancaria;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("João", 100);

        minhaConta.setTitular("João carlos");
        //Modo mais simples de fazer mais não o ideal
        //System.out.println("Meu nome é: " + minhaConta.getTitular());
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        //Modo mais simples de fazer mais não o ideal
        //minhaConta.setSaldo(minhaConta.getSaldo() + 200);
        //System.out.println("Novo valor é: " + minhaConta.getSaldo());

        //Meto mais usado no dia a dia
        String titularConta = minhaConta.getTitular();
        double saldofinal = minhaConta.getSaldo();

        System.out.println("O titular da conta é: " +  titularConta + " e o saldo final é " + saldofinal);

        ContaBancaria contatia = new ContaBancaria("Maria", 150);

        contatia.setTitular("Maria Cristina");
        contatia.setSaldo(contatia.getSaldo() + 100);

        String titular = contatia.getTitular();
        double valorFinal = contatia.getSaldo();

        System.out.println("O titular da conta é: " +  titular + " e o saldo final é " + valorFinal);


    }
}
