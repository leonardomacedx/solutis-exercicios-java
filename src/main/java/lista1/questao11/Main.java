package main.java.lista1.questao11;

import java.util.Scanner;

/*
11. Escreva um programa que tenha duas palavras como entrada, e a saída
imprima as palavras em ordem alfabética (utilize o método compareTo da
classe String),. Informe também, qual das palavras tem o maior número de
caracteres.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String entradaUm = sc.nextLine(), entradaDois = sc.nextLine();

        System.out.println("Em ordem alfabética: ");
        if (entradaUm.compareTo(entradaDois) == 1){
            System.out.print(entradaUm+", ");
            System.out.println(entradaDois);
        }else{
            System.out.print(entradaDois+", ");
            System.out.println(entradaUm);
        }
        if (entradaUm.length()> entradaDois.length()){
            System.out.println("A maior string é: "+ entradaUm);
        }else {
            System.out.println("A maior string é: "+ entradaDois);
        }
    }
}
