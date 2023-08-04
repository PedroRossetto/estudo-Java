package aula_0408.atividade;

public class Conta {
    private String nomeConta;
    private Double saldo;
    private Cliente cliente;

    Double valor = 0.0;
    public Conta() {
    }

    public Conta(String nomeConta, Double saldo, Cliente cliente) {
        this.nomeConta = nomeConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(Double valor) {
        if (valor > 0.0) {
            this.saldo += valor;
        }
    }

    public Double sacar(Double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "Nome da conta:'" + nomeConta + '\'' +
                ", Saldo da conta:=" + saldo +
                ", Cliente: " + cliente +
                '}';
    }
}
