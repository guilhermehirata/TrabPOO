import java.util.Scanner;

public class RGasto {
    private String tipo;
    private String data;
    private String FDPagamento;
    private double valor;

    public RGasto() {
    }

    public String getTipo() {
        return this.tipo;
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

    public String getFDPagamento() {
        return this.FDPagamento;
    }

    public void setFDPagamento(String FDPagamento) {
        this.FDPagamento = FDPagamento;
    }

    public double getValor() {
        return this.valor;
    }

    public String toString() {
        return "Gasto| Tipo: " + this.tipo + "| Data do gasto: " + this.data + "| Forma de pagamento: " + this.FDPagamento + "| Valor: R$" + this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void addGasto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de gasto");
        this.tipo = sc.nextLine();
        System.out.println("Digite a data do gasto, ex: 29-12-2002");
        this.data = sc.nextLine();
        System.out.println("Digite a forma de pagamento");
        this.FDPagamento = sc.nextLine();
        System.out.println("Digite o valor");
        this.valor = (double)sc.nextInt();
    }
}