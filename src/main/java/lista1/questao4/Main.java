package main.java.lista1.questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float  mile;
        System.out.println("Digite uma distância em milhas:");
        mile = input.nextFloat();
        double km = mile * 1.609;
        System.out.printf("%.4f milhas = %.4fkm",mile , km);
    }
}
