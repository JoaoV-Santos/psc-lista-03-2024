import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double raio;

        System.out.println("Escolha uma opção de operação:\n\n1.Perímetro de um círculo\n2.Área de um círculo\n3.Volume de uma esfera");
        int operacao = input.nextInt();

        if (operacao == 3)
            System.out.println("\nInforme o raio da esfera");
        else
            System.out.println("\nInforme o raio do círculo");

        raio = input.nextDouble();

        if (operacao == 1)
            System.out.printf("\nO perímetro do círculo é %.2f" , 2 * 3.141592 * raio);
        else if (operacao == 2)
            System.out.printf("\nA área do círculo é %.2f" , 3.141592 * raio * raio);
        else if (operacao == 3)
            System.out.printf("\nO volume da esfera é %.2f" , (4 * 3.141592 * raio * raio * raio) / 3);
        else
            System.out.println("\nCódigo de operação inválido.\nTente novamente e escolha uma das opções acima.");

        input.close();
    }
}
