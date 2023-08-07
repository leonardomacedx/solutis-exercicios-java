package main.java.lista1.questao8;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        scanner.close();

        palavra = palavra.toUpperCase();

        if (ehPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }

    public static boolean ehPalindromo(String palavra) {
        int i = 0;
        int j = palavra.length() - 1;

        while (i < j) {
            if (palavra.charAt(i) != palavra.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
