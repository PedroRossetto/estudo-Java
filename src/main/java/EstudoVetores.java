import java.util.Scanner;

public class EstudoVetores {
    public static void main(String[] args) {
//        // Vetores
//        int[] nums = {1, 2, 3, 4, 5}; // vetor de numeros inteiros
//        System.out.println(nums[4]);
//        nums[4] = 8;
//        System.out.println(nums[4]);
//
//        for (int i = 0; i < nums.length; i++) { //iterar sobre o vetor
//            System.out.print(nums[i]);
//        }
//
//        System.out.println();
//        // tem que definir o tamanho do vetor
//        double[] notas = new double[60]; // declara um vetor double vazio com 60 posições
//        notas[59] = 5.6;
//        System.out.println(notas[59]);
//
//        String[] nomes = {"Fernando", "Felipe"}; //dois modos são validos
//        String nomes1[] = {"Pedro", "Cadu"};
//
//        for(int num : nums) { // for each do java
//            System.out.print(num);
//        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de notas :");
        int nNotas = scanner.nextInt();
        double[] notas = new double[nNotas];

        for(int i = 0; i < nNotas; i++) {
            System.out.println("Digite a nota :");
            notas[i] = scanner.nextDouble();
        }

        double media = 0.0;

        for (double nota : notas) media += nota;

        media /= nNotas;
        System.out.printf("A media é igual a %.2f", media);

    }
}
