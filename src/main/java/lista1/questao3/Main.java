package main.java.lista1.questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Digite um número inteiro:");
        a = input.nextInt();
        for(int i = 1; i <= a; i++){
            if(isPrimo(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimo(int x){
        int divisores = 0;

        for (int i = 1; i <= x; i++){
            if(x % i == 0)
                divisores++;
        }
        return (divisores == 2);
    }
}
