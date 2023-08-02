package aula_0108;

import java.time.LocalDate;

public class Atividade010823_4 {

    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        LocalDate futuro = agora.plusWeeks(3);

        System.out.println(futuro);
    }

}
