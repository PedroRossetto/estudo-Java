import java.util.Scanner;

public class Atvidade280723 {
    public static void main(String[] args) {
        String email;
        String senha;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu email: ");
       email = scan.nextLine();

        System.out.println("Digite sua senha: ");
        senha = scan.nextLine();

        if(senha.length() <= 8 || !email.contains("@soulcode.com")) {
            System.out.println("Email ou senha invalidos!");
        } else {
            System.out.println("Parabéns por entrar");
        }



        System.out.println("Digite quantos valores você deseja que colocar em cada vetor");
        int x = scan.nextInt();

        int[] vetor1 = new int[x];
        int[] vetor2 = new int[x];
        int[] vetor3 = new int[x];

        System.out.println("Digite os valores do primeiro vetor: ");
        for(int i = 0; i < x; i++) {
            vetor1[i] = scan.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor: ");
        for(int i = 0; i < x; i++) {
            vetor2[i] = scan.nextInt();
        }

        for (int i = 0; i < x; i++) {
            vetor3[i] += (vetor1[i] + vetor2[i]);
        }

        System.out.println("Vetor soma dos 2 vetores : ");
        for (int i = 0; i < x; i++) {
            System.out.println(vetor3[i]);
        }
    }
}

