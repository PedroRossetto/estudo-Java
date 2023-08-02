import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstudoListas {
    public static void main(String[] args) {
        // vetor -> inflexivel
        // lista -> flexivel

        // generic -> <>
        List <Integer> lista = new ArrayList();// polimorfismo
        lista.add(9);
        lista.add(4);
        lista.add(5);
        lista.add(8);

        System.out.println(lista.get(0)); //obter elemento com base no indice
        System.out.println(lista.get(2));
//        System.out.println(lista.remove(2)); //remover o elemtno com base no indice
        System.out.println(lista.get(2));

        for (int i = 0; i < lista.size(); i++) { // for normal
            System.out.print(lista.get(i));
        }

        for (Integer listas : lista) {  // forEach
            System.out.print(listas);
        }


        Collections.sort(lista); //lista do maior pro menor

        System.out.println();
        for (int i = 0; i < lista.size(); i++) { // for normal
            System.out.print(lista.get(i));
        }

        for (Integer listas : lista) {  // forEach
            System.out.print(listas);
        }

        //Maneira de criar listas rapidas
        System.out.println();
        List<String> nomes = new ArrayList(List.of("Sky", "Ludmila", "Leonardo", "Gabriel"));

        Collections.sort(nomes); // ordena a lista de menor para o maior ou A - Z

        for (String nome : nomes) {
            System.out.println(nome);
        }

        //Wrapper -> Representação de tipo primitivo como Objeto
//        Integer integer
//        Double double
//        Boolean boolean
//        Long long
//        Float float

    }
}
