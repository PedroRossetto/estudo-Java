package aulas;

public class EstudoVariaveis {
    // variavel = container de dados
    // fortemente tipada = definir o tipo de cada variavel
    public static void main(String[] args) {
        // para definir uma variavel
        // <tipo> <nome> = <valor>;

        // Tipos primitivos: int, long, char, boolean, double, float
        // Tipos não primitivos: String, List

        // Como declarar variáveis?
        int estoque = 150; // até 2 bilhões

        long populacaoTerra = 7900000000L; // até na casa dos quintilhões (l no final representa sufixo long, precisa)

        double salarioDev = 5500.99; // até 15 casas de precisão
        float nota = 7.5f; // até 7 casas de precisão  (precisa do f no final)

        boolean ativo = true; //false ou true

        String nome = "Pedro"; // Só usa aspas duplas

        char letra = 'A'; // só representa um caractere

        //Tipagem forte
        int a = 1000;
        a = 2000; // reatribuição / atualização (é impossivel mudar o tipo)

        System.out.println("População da terra: " + populacaoTerra);
        System.out.println("Meu nome é: " + nome);
    }
}
