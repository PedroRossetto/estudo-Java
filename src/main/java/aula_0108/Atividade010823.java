package aula_0108;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade010823 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List <Integer> numeros = new ArrayList();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero ");
            int x = scan.nextInt();
            numeros.add(x);
        }
        int maior = 0;
        int menor = 1000000000;
        for (int i = 0; i < 5; i++) {
            if (numeros.get(i) > maior) {
                maior = numeros.get(i);
            } else if (numeros.get(i) < menor){
                menor = numeros.get(i);
            } else {
                menor = numeros.get(i);
            }
        }
        System.out.println("O maior numero é " + maior);
        System.out.println("O menor numero é " + menor);



    }
}
