package aula_1608.atividades.atividade3;

public class SMSNoticacao implements Noticacao{
    private String numDest;
    private String numOrig;
    private String mensagem;

    public SMSNoticacao(String numDest, String numOrig, String mensagem) {
        this.numDest = numDest;
        this.numOrig = numOrig;
        this.mensagem = mensagem;
    }

    @Override
    public void notificar() {
        System.out.println("De : " + numOrig + "\n Para: " + numDest + "\n" + mensagem);
    }
}
