package main.java.lista1.questao9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Raio: ");
        double raio = scanner.nextDouble();

        double area = Math.round(Math.PI * Math.pow(raio, 2));
        System.out.println("Área: " + area);
    }
}
