package Calculadora;

import java.util.Scanner;
public class multiplicacao {

    public multiplicacao() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");

        int num1;
        int num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("O primeiro numero digitado foi: " + num1);
        System.out.println("O segundo numero digitado foi: " + num2);

        int multiplicacao;
        multiplicacao = num1 * num2;

        System.out.println("O resultado da multiplicacao dos dois numeros informados é: " + multiplicacao);

        sc.close();
    }
}
