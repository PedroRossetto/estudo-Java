package aula_0408.cursos;

public class Professor {
    private String nome;

    private String rg;

    public Professor() {
    }

    public Professor(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return nome + " " + rg;
    }

}
