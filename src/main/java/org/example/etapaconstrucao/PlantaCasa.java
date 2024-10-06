package org.example.etapaconstrucao;

public class PlantaCasa {
    //Atributos
    int metragem;
    int numerosQuartos;
    int numerosBanheiros;
    String cor;
    String material;

    public void construir(){
        System.out.println("A casa foi construída, às características são: ");
        System.out.println("Metragem: " + metragem);
        System.out.println("Numeros de Quartos: " + numerosQuartos);
        System.out.println("Numeros de Banheiros: " + numerosBanheiros);
        System.out.println("Material:    " + material);
    }

    public void pintar() {
        System.out.println("A casa foi pintada de cor: " + cor);
    }

//    public void mudarDeCor(String novaCor) {
//        cor = novaCor;
//        pintar();
//}
//
        public int somarMetragem(){
            return metragem * numerosBanheiros + numerosQuartos;
        }
    public void alterarCaracteristicas(int metros, int quartos, int banheiros, String matCasa){
        metragem = metros;
        numerosQuartos = quartos;
        numerosBanheiros = banheiros;
        material = matCasa;
        construir();
    }
    }


