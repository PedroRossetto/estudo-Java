package aula_0408.cursos;

import java.util.List;

public class Curso {
    //  Composição de Objetos -> Representação de objetos dentro de outros Objetos

    private String nome;
    private Float cargaHoraria;
    private Professor professor;
    private List<Aluno> alunos;

    public Curso() {
    }

    public Curso(String nome, Float cargaHoraria, Professor professor, List<Aluno> alunos) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return nome + " " + cargaHoraria + " " + professor + " " + alunos;
    }

}
