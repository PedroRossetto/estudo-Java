package aula_0108;

import java.util.Scanner;

enum EstacoesDoAno {
    VERAO,
    OUTONO,
    INVERNO,
    PRIMAVERA
}


public class Atividadade010823_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o mês do ano (1-12): ");
        int mes = scanner.nextInt();


        switch (mes) {
            case 1:
            case 2:
            case 3:
                System.out.println(EstacoesDoAno.VERAO);
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(EstacoesDoAno.OUTONO);
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(EstacoesDoAno.INVERNO);
                break;
            case 10:
            case 11:
            case 12:
                System.out.println(EstacoesDoAno.PRIMAVERA);
                break;
        }
    }
}
