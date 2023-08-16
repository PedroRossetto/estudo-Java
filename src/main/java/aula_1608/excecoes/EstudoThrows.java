package aula_1608.excecoes;

public class EstudoThrows {

    public static void validarCPF(String cpf) throws Exception {
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF INVALIDO");
        }
        System.out.println("CPF válido.");
    }

    public static void main(String[] args) {

        try {
            validarCPF("123456789000");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
