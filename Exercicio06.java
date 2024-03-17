import java.util.Scanner;
import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();

        int num1,num2,numeroAleatorio;

        System.out.print("Informe o primeiro número: ");
        num1 = input.nextInt();
        System.out.print("Informe o segundo número: ");
        num2 = input.nextInt();

        if (num1 > num2)
            numeroAleatorio = gerador.nextInt(num2, num1);
        else
            numeroAleatorio = gerador.nextInt(num1, num2);

        if (numeroAleatorio % 2 == 0)
            System.out.println(numeroAleatorio + " é um número par.");
        else
            System.out.println(numeroAleatorio + " é um número ímpar.");


        input.close();

    }
}
