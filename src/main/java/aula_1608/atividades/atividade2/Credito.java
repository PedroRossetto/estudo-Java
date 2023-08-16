package aula_1608.atividades.atividade2;

import java.time.LocalDate;

public class Credito extends Pagamento{

    private Integer numeroCartao;
    private Double limite;
    private String bandeira;

    public Credito() {
    }

    public Credito(Double valor, LocalDate data, Integer numeroCartao, Double limite, String bandeira) {
        super(valor, data);
        this.numeroCartao = numeroCartao;
        this.limite = limite;
        this.bandeira = bandeira;
    }

    public Integer getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(Integer numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
