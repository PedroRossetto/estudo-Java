package aula_1608.atividades.atividade3;

public class EmailNoticacao implements Noticacao{

    private String emailDestinatario;
    private String emailOrigem;
    private String mensagem;

    public EmailNoticacao(String emailDestinatario, String emailOrigem, String mensagem) {
        this.emailDestinatario = emailDestinatario;
        this.emailOrigem = emailOrigem;
        this.mensagem = mensagem;
    }

    @Override
    public void notificar() {
        System.out.println("De : " + emailOrigem + "\n Para: " + emailDestinatario + "\n" + mensagem);
    }
}
