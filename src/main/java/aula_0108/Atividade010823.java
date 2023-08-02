package aula_0108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atividade010823 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List <Integer> numeros = new ArrayList();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero :");
            int x = scan.nextInt();
            numeros.add(x);
        }
        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);

        System.out.println("O maior numero é " + maior);
        System.out.println("O menor numero é " + menor);

    }
}
