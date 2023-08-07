package main.java.lista1.questao2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextDouble();
        if (a > b) {
            System.out.println(a);
        } else if (a == b) {

            System.out.println("Os valores são iguais ");
        } else {
            System.out.println(b);

        }
    }
}
