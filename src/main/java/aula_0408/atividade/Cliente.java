package aula_0408.atividade;

public class Cliente {
    private String nome;
    private Integer idade;
    private String cpf;

    public Cliente() {
    }

    public Cliente(String nome, Integer idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome do cliente: " + nome + '\'' +
                ", Idade do cliente:" + idade +
                ", Cpf do cliente:'" + cpf + '\'' +
                '}';
    }
}
