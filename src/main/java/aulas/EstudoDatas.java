package aulas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EstudoDatas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);
        System.out.println(dataHoraAtual.getYear());
        System.out.println(dataHoraAtual.getMonthValue());
        System.out.println(dataHoraAtual.getDayOfMonth());
        System.out.println(dataHoraAtual.getDayOfWeek());

        int ano = 2023;
        int mes = 12;
        int dia = 7;

        LocalDate dataValida = LocalDate.of(ano, mes, dia);
        System.out.println(dataValida);

        LocalDate data1 = LocalDate.now();
        LocalDate data2 = LocalDate.of(2023, 8, 2);
        if (data1.isAfter(data2)) {
            System.out.println("A data já passou!");
        }
        else {
            System.out.println("A data ainda não passou.");
        }

        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //formato br
        DateTimeFormatter formatoBr2 = DateTimeFormatter.ofPattern("EE, MMMM yyyy"); //formato br2
        String dataHoraAtualFormatada = dataHoraAtual.format(formatoBr2);
        System.out.println("Data formatada: "+dataHoraAtualFormatada);

    }
}
