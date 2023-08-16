package aula_1608.excecoes;

import aula_1608.excecoes.EmailMalFormatados.EmailMalFormatadoException;

public class EstudoThrow {
    public static void setIdade(int idade) {
        if (idade < 0) {
            // lançamento de erro
            throw new IllegalArgumentException();
        }
        System.out.println("Idade setada " + idade);
    }
    public static void validarEmail(String email) {
        if (email == null) {
            throw new EmailMalFormatadoException();
        }
        if (email.isBlank() || !email.contains("@")) {
            throw new IllegalArgumentException();
        }
        if (email.length() > 255) {
            throw new RuntimeException();
        }
        System.out.println("E-mail válido.");
    }

    public static void main(String[] args) {

        try {
            validarEmail(null);
        }
        catch (IllegalArgumentException | EmailMalFormatadoException ex) {
            System.out.println("Email incompleto.");
        }
        catch (RuntimeException ex) {
            System.out.println("Muito grande!!");
        }
    }
}
