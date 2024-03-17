import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double a,b,c;
        double delta;
        double x1 = 0;
        double x2 = 0;

        System.out.print("\nInforme o valor de a: ");
        a = input.nextDouble();
        System.out.print("\nInforme o valor de b: ");
        b = input.nextDouble();
        System.out.print("\nInforme o valor de c: ");
        c = input.nextDouble();

        if (a == 0 && b == 0 && c != 0)
            System.out.println("\n\nCoeficientes informados incorretamente.");
        else if (a == 0 && b !=0){
            System.out.println("\n\nEssa é uma equação de primeiro grau");
            //resolver a equacao
        }
        else {
            delta = b * b - (4 * a * c);

            if (delta < 0)
                System.out.println("\nEsta  equação não possui raízes reais.");
            else if (delta == 0) {
                System.out.println("\nEsta equação possui duas  raízes reais iguais.");
                x1 = ((b * -1) + Math.sqrt(delta)) / 2 * a ;
                x2 = ((b * -1) - Math.sqrt(delta)) / 2 * a ;

                System.out.println(x1 + " e " + x2);
            }
            else {
                System.out.println("\nEsta equação  possui duas raízes reais diferentes.");
                x1 = ((b * -1) + Math.sqrt(delta)) / 2 * a ;
                x2 = ((b * -1) - Math.sqrt(delta)) / 2 * a ;

                System.out.println(x1 + " e " + x2);
            }
        }

        input.close();
    }
}
