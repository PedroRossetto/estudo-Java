package aula_0108;

import java.util.ArrayList;
import java.util.List;

public class Atividade010823_2 {
    public static void main(String[] args) {
        List <Integer> numeros2 = new ArrayList();
        numeros2.add(1);
        numeros2.add(5);
        numeros2.add(7);
        numeros2.add(9);
        numeros2.add(15);
        double total = 0;
        double media = 0;
        for (int i = 0; i < numeros2.size(); i++) {
            total += numeros2.get(i);
            media = (total / 5);
        }
        System.out.println("A média aritmetica é: " + media);
    }
}
