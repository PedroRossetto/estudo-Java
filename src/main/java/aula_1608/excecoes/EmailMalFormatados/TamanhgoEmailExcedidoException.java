package aula_1608.excecoes.EmailMalFormatados;

public class TamanhgoEmailExcedidoException extends RuntimeException{

    public TamanhgoEmailExcedidoException() {
    }

    public TamanhgoEmailExcedidoException(String message) {
        super(message);
    }
}
