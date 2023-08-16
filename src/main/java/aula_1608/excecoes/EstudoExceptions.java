package aula_1608.excecoes;

import java.util.Scanner;

public class EstudoExceptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Estrutura para tratamento de exceções


        try {
            System.out.println("Digite um numero");
            int num = scanner.nextInt();
            System.out.println(num);
        }
        catch(Exception ex) {
            System.out.println("É pra colocar numero, cabeça");
        }
        finally {
            //sempre é executado
            System.out.println("Fim!");
        }

    }
}

