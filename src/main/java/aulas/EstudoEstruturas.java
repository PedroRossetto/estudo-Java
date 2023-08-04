package aulas;

import java.util.Scanner;

public class EstudoEstruturas {
    public static void main(String[] args) {
        // Scanner = vai permitir a leitura de dados do teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine(); //aguarda o texto digitado pelo usuario

        System.out.println("Digite altura");
        double altura = entrada.nextDouble(); //digite o numero com virgula

        System.out.println("Digite peso");
        double peso = entrada.nextDouble(); //digite o numero com virgula

        double imc = peso / (altura*2);
        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu imc é: " + imc);

        // Leia o peso da pessoa
        // Calcule o IMC
        // Verifique a situação do imc calculado com
        // base em: https://www.saude.rj.gov.br/obesidade/calcule-seu-imc

        if(imc < 17) {
            System.out.println("Muito abaixo do peso.");
        } else if(imc >= 17 && imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if(imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal.");
        } else if(imc >= 25 && imc < 30) {
            System.out.println("Acima do peso.");
        } else if(imc >= 30 && imc < 35) {
            System.out.println("Obesidade I");
        } else if(imc >= 35 && imc < 40) {
            System.out.println("Obesidade II");
        } else {
            System.out.println("Obesidade III");
        }

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        String mensagem = (idade >= 18) ? "Você é maior de idade" : "Você é menor de idade";
        System.out.println(mensagem);

        // Repetição
        // Inicio
        // Condição de parada
        // Atualização do valor

        System.out.println("Digite quantos alimentos você come : ");
        int total = entrada.nextInt();

        for(int i = 0; i < total; i++) {
            System.out.println("Você gosta de batata!");
        }

        // Exercicio: Criem uma versão com while do código acima
        int number = 0;
        while (number < total) {
            number++;
            System.out.println("Você gosta de frango!!");
        }
    }
}
