package org.example.etapaconstrucao;

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

 //       casa.mudarDeCor("Azul");

        casa.alterarCaracteristicas(200, 3, 3, "cimento");

        int resultado = casa.somarMetragem();
        System.out.println("O resultado é: " + resultado);

        //Casa vizinho
        PlantaCasa casaJoao =  new PlantaCasa();

        casaJoao.numerosBanheiros = 5;
        casaJoao.numerosQuartos = 5;
        casaJoao.metragem = 110;
        casaJoao.material = "Pedra + Cimento";
        casaJoao.cor = "Verde + Amarelo";

        casaJoao.construir();

        casaJoao.pintar();



    }
}
