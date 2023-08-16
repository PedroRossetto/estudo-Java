package aula_1608.atividades.atividade3;

public class Main {
    public static void main(String[] args) {

        Noticacao noticacao = new EmailNoticacao("x@mail.com", "y@gmail.com", "Fala doido");
        Noticacao noticacao1 = new SMSNoticacao("123", "5233", "Fala doidao");
        noticacao.notificar();
        noticacao1.notificar();
    }
}
