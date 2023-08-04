package aula_0408.atividade;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList <Conta> ();
    }



    public Banco(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> criarContas(Cliente cliente) {
        Conta conta = new Conta();
        conta.setCliente(cliente);
        conta.setSaldo(0.0);
        conta.setNomeConta(cliente.getNome());
        contas.add(conta);
        return contas;
    }

    public void buscarConta(Cliente cliente) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNomeConta() == cliente.getNome()) {
                 System.out.println(contas.get(i));
            }
        }
    }

    public void listarContas() {
        for (int i = 0; i < contas.size(); i++) {
                System.out.println(contas.get(i));
            }
    }


    @Override
    public String toString() {
        return "Banco{" +
                "Contas no banco : " + contas +
                '}';
    }
}
