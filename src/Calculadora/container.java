package Calculadora;

import java.util.Scanner;

public class container {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual operação deseja realizar?");
        System.out.println("Digite 1 para soma e 2 para multiplicação");

        Integer x;
        x = sc.nextInt();

        if (x == 1) {
            soma soma = new soma();

        } else if (x == 2) {
            multiplicacao multiplicacao = new multiplicacao();

        }
    }
}
