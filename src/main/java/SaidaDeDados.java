public class SaidaDeDados {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.err.println("Ops! Houve um erro!"); // impressao de erro


        int n1 = 7;
        int n2 = 9;
        int soma = n1 + n2;

        String nome = "Matheus";

        System.out.printf("A soma de %d e %d é igual a %d.\n", n1, n2, soma);

        System.out.printf("Bem vindo, %s!\n", nome);

        double nu1 = 3.4;
        double nu2 = 12.5;
        double div = nu2/ nu1;

        System.out.printf("A divisao de %.2f por %.2f é igual a %.3f. \n", nu1, nu2, div);
        // %d --> mapeia um numero
        // %s --> mapeia um texto
        // %f --> mapeia um numero flutuante/numero quebrados
        //.numero antes do f limita as casas que vai mostrar
    }
}
