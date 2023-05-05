import java.util.Scanner;

public class RGanho {
    private String tipo;
    private String data;
    private double valor;

    public RGanho() {
    }

    public String getTipo() {
        return this.tipo;
    }

    public String toString() {
        return "Ganho| Tipo: " + this.tipo + "| Data do ganho: " + this.data + "| Valor: R$" + this.valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void addGanho() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de ganho");
        this.tipo = sc.nextLine();
        System.out.println("Digite a data do gasto, ex: 29-12-2002");
        this.data = sc.nextLine();
        System.out.println("Digite o valor");
        this.valor = (double)sc.nextInt();
    }
}
