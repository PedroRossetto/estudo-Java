package aula_1608.atividades.atividade2;

import java.time.LocalDate;

public class Boleto extends Pagamento{
    private String codigo;

    public Boleto() {
    }

    public Boleto(Double valor, LocalDate data, String codigo) {
        super(valor, data);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
