import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double a,b,c,media,maiorNumero,menorNumero;


        System.out.print("Informe o primeiro número: ");
        a = input.nextDouble();
        System.out.print("\nInforme o segundo número: ");
        b = input.nextDouble();
        System.out.print("\nInforme o terceiro número: ");
        c = input.nextDouble();

        media = (a + b + c) / 3 ;

        if (a > b && b > c){
            maiorNumero = a ;
            menorNumero = c ;
        }
        else if (a > c && c > b) {
            maiorNumero = a ;
            menorNumero = b ;
        }
        else if (b > a && a > c) {
            maiorNumero = b ;
            menorNumero = c ;
        }
        else if (b > c && c > a) {
            maiorNumero = b ;
            menorNumero = a ;
        }
        else if (c > a && a > b) {
            maiorNumero = c ;
            menorNumero = b ;
        }
        else {
            maiorNumero = c;
            menorNumero = a;
        }

        System.out.println("\n\nMaior Número: " + maiorNumero);
        System.out.println("\nMenor Número: " + menorNumero);
        System.out.println("\nMédia dos Três Números: " + media);

        input.close();
    }
}
