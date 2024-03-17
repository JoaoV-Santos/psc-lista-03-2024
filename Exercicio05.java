import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double num1,num2;
        String operador;

        System.out.print("Insira o primeiro número real: ");
        num1 = input.nextDouble();
        System.out.print("\nInforme o tipo de operação (+ , - , * , / ou ^): ");
        operador = input.next();
        System.out.print("\nInsira o segundo número real: ");
        num2 = input.nextDouble();


        switch (operador){
            case "+":
                System.out.println("\n\n" + num1 + " " + operador + " " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println("\n\n" + num1 + " " + operador + " " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println("\n\n" + num1 + " " + operador + " " + num2 + " = " + (num1 * num2));
                break;
            case "/":
                System.out.println("\n\n" + num1 + " " + operador + " " + num2 + " = " + (num1 / num2));
                break;
            case "^":
                System.out.println("\n\n" + num1 + " " + operador + " " + num2 + " = " + (Math.pow(num1, num2)));
                break;
            default:
                System.out.println("\n\nO símbolo de operação é inválido");
        }



        input.close();
    }
}
