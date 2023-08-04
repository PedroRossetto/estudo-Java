package aula_0408.estudos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EstudoConstrutores {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<String>();
        produtos.add("Sapato");
        produtos.add("Camiseta confortavel");
        produtos.add("Cantinho do vale");
        Venda venda = new Venda(LocalDate.now(), "José", produtos, 300.50);

        Venda venda1 = new Venda();
        Venda venda2 = new Venda(LocalDate.now());
        Venda venda3 = new Venda(LocalDate.now(), "Seu Josenildo");


        System.out.println(venda);
    }
}
