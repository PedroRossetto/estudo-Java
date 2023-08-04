package aula_0408.cursos;

import java.util.ArrayList;
import java.util.List;

public class EstudoComposicao {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro", "5473857483");
        Aluno aluno2 = new Aluno("Carlos", "43289238492");
        Aluno aluno3 = new Aluno("Lucas", "32894534954");
        List<Aluno> alunos = new ArrayList<Aluno>(List.of(aluno1, aluno2, aluno3));

        Professor professor1 = new Professor("Gabriel", "12349566-7");

        Curso curso = new Curso("Java", 200.0F, professor1, alunos);

        System.out.println(curso);

        System.out.println(curso.getAlunos().get(2).getNome());
    }
}
