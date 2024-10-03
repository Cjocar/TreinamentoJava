package org.example;

public class Casa {
    public static void main(String[] args) {
        //Criando um objeto casa
        PlantaCasa casa =  new PlantaCasa();

        //Inicializando os atributos (Variáveis) (Características) Casa
        casa.numerosBanheiros = 2;
        casa.numerosQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        //Chamada de função (método) da ordem;
        casa.construir();

        casa.pintar();
    }
}
