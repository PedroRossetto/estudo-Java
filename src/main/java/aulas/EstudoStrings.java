package aulas;

import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
//        String java = "Java";
//        int num = 2;
//        //valor nao primitivo --> objeto
//
//        System.out.println(java.toLowerCase()); // minuscula
//        System.out.println(java.toUpperCase()); // maiuscula
//        System.out.println(java.charAt(0)); // caractere com base na sua posicao
//        System.out.println(java.indexOf("Ja")); // indice do primeiro substring
//        System.out.println(java.replace("a", "e")); //troca string
//        System.out.println(java.replaceAll("a", "i"));
//        System.out.println(java.substring(0, 2)); // busca os caracteres no intervalo do indice +1
//        System.out.println(java.length()); // tamanho texto
//
//        String nome1 = "Esphane";
//        String nome2 = "EsPhane";
//        String nome3 = "EsPhane";
//
//        System.out.println(nome1 == nome2); // true - compara os objetos nome1 e nome2
//        System.out.println(nome1.equals(nome2)); // compara os textos de nome1 e nome2
//        System.out.println(nome1.equalsIgnoreCase((nome2)));
//        System.out.println("texto".equals("texto2") && "texto2".equals("texto3")); // comparando mais de 2 textos
        // ctrl + d --> copia pra baixo
        // ctrl + c --> copia
        Scanner scanner = new Scanner(System.in);
        String texto = "Vamos para o break retornamos as 10:35";
        System.out.println("Digite uma palavra :");
        String palavra = scanner.nextLine();
        System.out.println(palavra);

        // Empty nao considera espaço, blank considera
        if(palavra.isEmpty()) {
            System.out.println("Conteudo vazio");
        }
        else if(texto.contains(palavra)) {
            System.out.println("Contém");
        }
        else {
            System.out.println("Não contém");
        }
    }
}
