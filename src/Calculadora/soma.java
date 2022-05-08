package Calculadora;

import java.util.Scanner;

public class soma {

    public static void main (String[] args) {

        System.out.println("Digite dois numeros");

        Scanner sc = new Scanner(System.in);
        Integer num1;
        Integer num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("O primeiro digitado foi: " + num1);
        System.out.println("O segundo numero digitado foi: " + num2);

        Integer soma;
        soma = num1 + num2;

        System.out.println("O resultado da soma entre estes numeros é: " + soma);

        sc.close();
    }
}
