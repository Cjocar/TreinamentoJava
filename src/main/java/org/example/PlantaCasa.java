package org.example;

public class PlantaCasa {
    //Atributos
    int metragem;
    int numerosQuartos;
    int numerosBanheiros;
    String cor;
    String material;

    public void construir(){
        System.out.println("A casa foi construida, as caracteristicas são");
        System.out.println("Metragem " + metragem);
        System.out.println("Numeros de Quartos " + numerosQuartos);
        System.out.println("Numeros de Banheiros " + numerosBanheiros);
        System.out.println("material " + material);
    }

    public void pintar(){
        System.out.println("A casa foi pintada de cor" + cor);
    }

}
