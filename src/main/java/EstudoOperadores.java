public class EstudoOperadores {
    public static void main(String[] args) {
        // operadores matematicos
        int a = 10;
        int b = 15;
        int soma = a + b;
        int subtracao = b - a;
        int multiplicacao = a * b;
        double divisao = b / a; // divisão entre dois inteiros = inteiro

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

        //Fazendo a divisao do jeito adequado
        double c = 10;
        double d = 15;
        double divisao2 = d / c;
        // Divisão entre double e int => double
        System.out.println(divisao2);


        // Math
        double x = Math.pow(2, 3);
        double y = Math.sqrt(144);

        System.out.println(Math.PI);


        // Incremento/Decremento
        int valor = 5;
        valor++;
        valor--;
        valor += 10;

        // operadores relacionais (>, <, >=, <=, ==< !=)
        boolean teste1 = 10 > 5; //true
        boolean teste2 = 5 < 1; //false
        boolean teste3 = 5 == 5; //true
        boolean teste4 = 4 != 5; //true
        boolean teste5 = 5 >= 5; //true
        boolean teste6 = 6 <= 8; //true


        // operadores lógicos (&&, ||, !)
        boolean teste7 = true && false; //false
        boolean teste8 = true || false; //true
        boolean teste9 = !true || false; //false
        boolean teste10 = (5 > 10) && (8 > 4); //false

        System.out.println(teste10);


        // Exercicio I
        // Crie duas variaveis: peso e altura.
        // Calcule o IMC = peso / (altura * altura)
        // Mostre na tela o IMC.

        double peso = 60.50;
        double altura = 1.67;
        double imc = peso / (altura * altura);
        System.out.println("Seu imc é: " + imc);

    }
}
