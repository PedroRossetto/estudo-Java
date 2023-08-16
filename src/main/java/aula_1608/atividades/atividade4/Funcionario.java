package aula_1608.atividades.atividade4;

public abstract class Funcionario {
    private String cargo;
    private String cpf;

    public Funcionario(String cargo, String cpf) {
        this.cargo = cargo;
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
