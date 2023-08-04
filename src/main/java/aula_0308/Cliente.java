package aula_0308;

import java.time.LocalDate;

public class Cliente {

    private String nome;

    private String cpf;

    private static String email;

    private LocalDate dataNascimento;



    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void inserirData(String novaDataNascimento) {
        dataNascimento = LocalDate.parse(novaDataNascimento);
    }

    // usar alt + insert para gerar get e set

}
