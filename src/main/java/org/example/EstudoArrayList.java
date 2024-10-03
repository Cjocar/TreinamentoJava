package org.example;
import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
    public static void main(String[] args) {
        //Alt+Enter ->  importa classe
        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em pó");
        listaDeCompras.add("Macarrão");

        System.out.println("***************************************************************");
        listaDeCompras.add(1, " Banana");

        System.out.println("***************************************************************");
        for (String item : listaDeCompras) {
            System.out.println(item);
        }
        System.out.println("***************************************************************");
        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho:" + item);

        System.out.println("***************************************************************");
        listaDeCompras.remove("Sabão em pó");


        for (String item2 : listaDeCompras) {
            System.out.println(item2);
        }

        System.out.println("****************************************************************");
        boolean eVazia = listaDeCompras.isEmpty();
        System.out.println(eVazia);

        System.out.println("****************************************************************");
        int tamanho = listaDeCompras.size();
        System.out.println(tamanho);

        System.out.println("*****************************************************************");
        boolean contem = listaDeCompras.contains("Arroz");
        System.out.println(contem);
    }


}



