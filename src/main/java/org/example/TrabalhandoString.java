package org.example;

public class TrabalhandoString {
    public static void main(String[] args) {
            String nome = "João ";
        String sobrenome = "Carlos";


        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(sobrenome);
        String nomeCompleto = nome.concat(sobrenome);

            System.out.println("Olá " + nome.toUpperCase() + " seu nome tem " + tamanhoString + " caracteres");
            System.out.println("Olá " + nome.toLowerCase() + " seu nome tem " + tamanhoString + " caracteres");
            System.out.println("Nome completo: " + nome  + sobrenome);

        }
}
