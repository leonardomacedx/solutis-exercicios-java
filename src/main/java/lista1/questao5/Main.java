package main.java.lista1.questao5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] diasSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabádo", "Domingo"};
        System.out.print("Escolha um número: ");
        int num = scanner.nextInt();
        System.out.println(diasSemana[num - 1]);

        scanner.close();
    }
}
