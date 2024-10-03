package org.example;

public class ConversaoTipos {
    public static void main(String[] args) {
        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int int2 = (int) d2;
//Não é possivel converter o int para uma string

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();


        String numeroStringDois = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroStringDois);
        Double numeroConvertidoDouble = Double.parseDouble(numeroStringDois);
        Long numeroConvertidoLong = Long.parseLong(numeroStringDois);


        Long numerolong = 10L;
        String numeroStringLong = numerolong.toString();


        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroInteger + " " + numeroString);
        System.out.println(numeroStringDois + " " + numeroString);


    }

}
