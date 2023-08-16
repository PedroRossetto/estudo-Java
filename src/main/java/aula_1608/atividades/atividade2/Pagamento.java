package aula_1608.atividades.atividade2;

import java.time.LocalDate;

public abstract class Pagamento { // Pagamento nao pode ser instanciado
    private Double valor;
    private LocalDate data;

    public Pagamento() {
    }

    public Pagamento(Double valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
