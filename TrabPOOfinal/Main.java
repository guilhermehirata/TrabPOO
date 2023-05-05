import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        int VGastos = 0;
        int VGanhos = 0;

        System.out.println("Bem-vindo(a) ao controle financeiro!");
        Scanner sc = new Scanner(System.in);
        RGasto[] gastos = new RGasto[100];
        RGanho[] ganhos = new RGanho[100];
        Relatorio relatorio = new Relatorio();
        boolean terminou = false;
        while (!terminou) {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("(1)  Adicionar gasto");
            System.out.println("(2)  Adicionar ganho");
            System.out.println("(3)  Visualizar relatório de gastos");
            System.out.println("(4)  Visualizar relatório de ganhos");
            System.out.println("(5)  Visualizar relatório mensal (ganhos - gastos)");
            System.out.println("(6)  Sair");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    gastos[VGastos] = new RGasto();
                    gastos[VGastos].addGasto();
                    System.out.println(gastos[VGastos]);
                    VGastos++;
                    break;
                case 2:
                    ganhos[VGanhos] = new RGanho();
                    ganhos[VGanhos].addGanho();
                    System.out.println(ganhos[VGanhos]);
                    VGanhos++;
                    break;
                case 3:
                    System.out.println("-------------------------------------");
                    relatorio.RGastos(VGastos, gastos);
                    System.out.println("-------------------------------------");
                    System.out.println("Relatório de gastos finalizado!");
                    break;
                case 4:
                    System.out.println("-------------------------------------");
                    relatorio.RGanhos(VGanhos, ganhos);
                    System.out.println("-------------------------------------");
                    System.out.println("Relatório de ganhos finalizado!");
                    break;
                case 5:
                    relatorio.RMensal(VGastos, VGanhos, gastos, ganhos);
                    break;
                case 6:
                    System.out.println("Até a proxima :)");
                    terminou = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        sc.close();
    }
}
