package aula_1608.atividades.atividade2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2023, 5, 13);

        Pagamento pagamento1 = new Boleto(1500.5, data1, "2345523");
        Pagamento pagamento2 = new Credito(250.5, data1, 4329043, 4500.5, "MasterCard");
        Pagamento pagamento3 = new PayPal(50.5, data1, "feef@gmail.com", 0.7F);
    }
}
