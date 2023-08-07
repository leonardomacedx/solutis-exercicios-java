package main.java.lista1.questao6;

public class Main {
    public static void main(String[] args) {

        int produtoInt = 1;
        float produtoFloat = 1;
        for (int i = 15; i <= 30; i += 2) {
            produtoInt *= i;
            produtoFloat *= i;
        }

        System.out.println("Produto inteiro: " + produtoInt);
        System.out.println("Produto float: " + produtoFloat);
    }
}
