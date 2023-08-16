package aula_1508.heranca;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produto batata = new Produto("Batata", 8.50F, "1579563");
        System.out.println(batata.getNome());
        System.out.println(batata.getCodigo());
        System.out.println(batata.getPreco());

        Livro cleanCode = new Livro("Clean Code", 200.5F, "3458958349", 300, "123.3453.423.53");
        System.out.println(cleanCode.getNome());
        System.out.println(cleanCode.getPreco());
        System.out.println(cleanCode.getNumPaginas());
        System.out.println(cleanCode.getIsbn());

        Comida tapioca = new Comida("Pudim", 25.0F, "2343249230", LocalDate.of(2023, 9, 30), 100.0F);
        System.out.println(tapioca.getNome());
        System.out.println(tapioca.getPrazoDeValidade());

        Carne gado = new Carne("Picanha", 100.0F, "4923049230", LocalDate.of(2023, 9, 30), 200.0F, "Bovina");
        System.out.println(gado.getNome());
        System.out.println(gado.getCategoria());
        System.out.println(gado.getPreco());
    }

}
