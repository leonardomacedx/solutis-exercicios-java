package main.java.lista1.questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String vogaisString = "AEIOU";
        int vogais = 0, consoantes = 0, espacos = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva os caracteres: ");
        String input = in.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toUpperCase(input.charAt(i));
            if (ch >= 'A' && ch <= 'Z') {
                if (vogaisString.indexOf(ch) != -1) {
                    vogais++;
                } else {
                    consoantes++;
                }
            } else {
                espacos++;
            }
        }
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Espaços em branco: " + espacos);
    }
}
