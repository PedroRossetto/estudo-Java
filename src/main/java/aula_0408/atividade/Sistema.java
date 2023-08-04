package aula_0408.atividade;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Pedro", 20, "523-424-435-42");
        Cliente cliente1 = new Cliente("Sabrina", 25, "403.380.580-01");
        Cliente cliente2 = new Cliente("Luana", 18, "488.435.030-81");
        Cliente cliente3 = new Cliente("Jessica", 30, "902.964.370-69");
        Cliente cliente4 = new Cliente("Josias", 36, "996.621.690-16");
        Cliente cliente5 = new Cliente("Estefano", 56, "361.056.840-29");

        List<Conta> contas = new ArrayList<Conta>();

        Banco banco = new Banco();

        banco.criarContas(cliente);
        banco.criarContas(cliente1);
        banco.criarContas(cliente2);
        banco.criarContas(cliente3);
        banco.criarContas(cliente4);
        banco.criarContas(cliente5);


        banco.buscarConta(cliente2);
        banco.listarContas();
    }
}
