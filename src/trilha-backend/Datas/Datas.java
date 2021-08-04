package Datas;

import org.w3c.dom.ls.LSOutput;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate hoje = LocalDate.now();
        System.out.println("Data de hoje: " + hoje.format(formatador));

        LocalDate aniversario = LocalDate.of(1993, Month.MARCH, 25);
        System.out.println("Meu aniversário é: " + aniversario.format(formatador));

        Period periodo = Period.between(aniversario, hoje);
        System.out.println("Minha idade é: " + periodo.getYears());

        DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorHoras));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);
    }
}
