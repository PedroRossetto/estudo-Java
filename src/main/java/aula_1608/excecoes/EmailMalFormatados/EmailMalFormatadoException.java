package aula_1608.excecoes.EmailMalFormatados;

public class EmailMalFormatadoException extends RuntimeException{

    public EmailMalFormatadoException() {

    }

    public EmailMalFormatadoException(String message) {
        super(message);
    }
}
