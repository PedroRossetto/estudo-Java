package aula_1608.atividades.atividade2;

import java.time.LocalDate;

public class PayPal extends Pagamento{
    private String email;

    private Float taxa;

    public PayPal() {
    }

    public PayPal(Double valor, LocalDate data, String email, Float taxa) {
        super(valor, data);
        this.email = email;
        this.taxa = taxa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getTaxa() {
        return taxa;
    }

    public void setTaxa(Float taxa) {
        this.taxa = taxa;
    }
}
