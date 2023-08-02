package aula_0108;

import java.util.ArrayList;
import java.util.List;

public class Atividade010823_2 {

    public static Double media(List<Double> numeros2) {
        double total = 0;
        for (int i = 0; i < numeros2.size(); i++) {
            total += numeros2.get(i);
        }
        return (total / numeros2.size());
    }


    public static void main(String[] args) {
        List <Double> numeros2 = new ArrayList(List.of(4.0, 5.0, 7.0, 9.0, 3.0, 2.0));



        System.out.println("A média aritmetica é: " + media(numeros2));
    }
}
