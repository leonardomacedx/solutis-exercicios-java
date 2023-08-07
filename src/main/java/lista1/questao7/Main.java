package main.java.lista1.questao7;

public class Main {
        public static void main(String[] args) {
            System.out.println("Resultados usando o tipo int:");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    int resultado = i / 2;
                    System.out.println("Múltiplo de 3: " + i + ", Divisão por 2: " + resultado);
                }
            }

            System.out.println("\nResultados usando o tipo double:");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    double resultado = (double) i / 2;
                    System.out.println("Múltiplo de 3: " + i + ", Divisão por 2: " + resultado);
                }
            }
        }
    }


