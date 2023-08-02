package aula_0108;

public class Atividade010823_3 {

    public static String isPrimo(int n) {
        String primo = "É um número primo";
        for (int i = 2; i < n; i++ ) {
            if (n % 2 == 0) {
                primo = "Não é um número primo";
            }
        }
        return primo;
    }
    public static void main(String[] args) {

        System.out.println(isPrimo(13));

    }
}
