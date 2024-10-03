package org.example;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Declaração de Array
        int[]  numeros = {10,20,30,40,1};
        String[] funcionarios;
        //inicializar
        funcionarios = new String[]{"Tais", "Lais", "Vinicius"};

        double[] salarios= new double[5];
        salarios[0] = 100.00;
        salarios[1] = 500.00;
        salarios[2] = 300.00;
        salarios[3] = 25.00;
        salarios[4] = 600.00;

        //Mostrando um elemento
        System.out.println("Os valores são: " + salarios[2]);

        //Mostrando todos os elementos
        System.out.println("Os valores são: " + Arrays.toString(salarios));

        for(double salario : salarios) {
        System.out.println(salario);

        salarios[2] = 250.00;
        System.out.println(salarios[2]);

        }
    }
}
