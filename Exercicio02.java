import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double total;
        double valorPago;
        double troco;

        System.out.print("Informe o valor da compra: ");
        total = input.nextDouble();
        System.out.print("\nInforme o valor pago à máquina: ");
        valorPago = input.nextDouble();

        troco = valorPago - total ;

        System.out.print("\nValor pago: R$ " + valorPago);
        System.out.print("\nValor da compra: R$ " + total);
        System.out.println("\nTroco: R$ " + troco);

        if (valorPago < total)
            System.out.println("\nEsta quantia é insuficiente para realizar a compra.");

        if (troco >= 50) {
            troco = troco - 50;
            System.out.println("\nNotas de 50: 1");
        }
        else
            System.out.println("\nNotas de 50: 0");

        if (troco >= 20) {
            troco = troco - 20;
            System.out.println("\nNotas de 20: 1");
        }
        else
            System.out.println("\nNotas de 20: 0");
        if (troco >= 10) {
            troco = troco - 10;
            System.out.println("\nNotas de 10: 1");
        }
        else
            System.out.println("\nNotas de 10: 0");
        if (troco >= 5) {
            troco = troco - 5;
            System.out.println("\nNotas de 5: 1");
        }
        else
            System.out.println("\nNotas de 5: 0");
        if (troco >= 2) {
            troco = troco - 2;
            System.out.println("\nNotas de 2: 1");
        }
        else
            System.out.println("\nNotas de 2: 0");
        if (troco >= 1) {
            troco = troco - 1;
            System.out.println("\nNotas de 1: 1");
        }
        else
            System.out.println("\nNotas de 1: 0");



        input.close();
    }
}
