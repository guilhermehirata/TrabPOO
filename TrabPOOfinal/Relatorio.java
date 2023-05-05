public class Relatorio {

    public void RGastos(int VGastos, RGasto[] gastos){
        for(int i = 0; i < VGastos; i++){
            System.out.println(gastos[i]);
        }
    }

    public void RGanhos(int VGanhos, RGanho[] ganhos){
        for(int i = 0; i < VGanhos; i++){
            System.out.println(ganhos[i]);
        }
    }

    public void RMensal(int VGastos, int VGanhos, RGasto [] gastos, RGanho[] ganhos){
        double SGastos = 0;
        double SGanhos = 0;
        for(int i = 0; i < VGastos; i++){
            double a = gastos[i].getValor();
            SGastos = SGastos + a;
        }
        for(int i = 0; i < VGanhos; i++){
            double b = ganhos[i].getValor();
            SGanhos = SGanhos + b;
        }
        System.out.println("O valor de gastos total foi de: R$" + SGastos);
        System.out.println("O valor de ganhos total foi de: R$" + SGanhos);
        double total = SGanhos - SGastos;
        System.out.println("O seu ganhos - gastos R$" + total);

    }
}
