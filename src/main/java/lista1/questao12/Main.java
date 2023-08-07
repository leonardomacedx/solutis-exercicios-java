package main.java.lista1.questao12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
12. Os motoristas se preocupam com a quilometragem obtida por seus
automóveis. Um motorista monitorou vários tanques cheios de gasolina registrando a
quilometragem dirigida e a quantidade de combustível em litros utilizados para
cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada
os quilômetros dirigidos e os litros de gasolina consumidos (ambos com
inteiros) para cada tanque cheio. O programa deve calcular e exibir o consumo
em quilômetros/litro para cada tanque cheio e imprimir a quilometragem
combinada e a soma total de litros de combustível consumidos até esse ponto.
Todos os cálculos de média devem produzir resultados de ponto flutuante.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao seu app de contabilização!");
        String escolhaMenu;
        int quilometro, gasolina;
        List<Tanque> tanques = new ArrayList<>();

        System.out.println("---------------------------------");
        System.out.println("Digite:");
        System.out.println("---------");
        System.out.println("1 - Adicionar um novo tanque");
        System.out.println("4 - Encerrar programa");
        System.out.println("---------------------------------");

        escolhaMenu = sc.nextLine();

        while(!escolhaMenu.equals("4")){
            System.out.println("Digite quantos quilômetros foram dirigidos:");
            quilometro = sc.nextInt();
            System.out.println("Digite o valor de gasolina consumido:");
            gasolina = sc.nextInt();
            tanques.add(new Tanque(quilometro, gasolina));

            System.out.println("---------------------------------");
            System.out.println("Digite:");
            System.out.println("---------");
            System.out.println("1 - Adicionar um novo tanque");
            System.out.println("4 - Encerrar programa");
            System.out.println("---------------------------------");

            escolhaMenu = sc.next();
        }

        for (int i = 0; i < tanques.size() ; i++) {
            System.out.println("Para o tanque "+ (i+1)+", o consumo de km por litro foi: "
                    + (float) tanques.get(i).getQuilometros()/(float) tanques.get(i).getGasolina() +" km/l");
        }
    }
}

class Tanque{
    private int quilometros;
    private int gasolina;

    public Tanque(int quilometros, int gasolina) {
        this.quilometros = quilometros;
        this.gasolina = gasolina;
    }

    public int getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(int quilometros) {
        this.quilometros = quilometros;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }
}
