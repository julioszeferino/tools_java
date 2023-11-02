package br.com.example.aula09;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
 * Data-[Hora] local: sera armazenada  sem fuso horario. Exemplo: 2019-06-20T05:15:30
 *  - Usamos quando o momento exato nao interessa a pessoas de outro fuso, como em sistema de regiao unica.
 *
 * Data Hora global: sera armazenada com fuso horario. Exemplo: 2019-06-20T05:15:30UTC-3:00
 *  - Usamos quando o momento exato e importante, como em sistemas multi-regiao.
 *
 * Duracao: tempo decorrido entre duas data-horas.
 *
 * Timezone: regiao do planeta onde o fuso horario e o mesmo. Exemplo: America/Sao_Paulo ou UTC-3:00
 *
 * PADRAO ISO 8601 (Forma de representar data e hora)
 * Data-[Hora] local:
 *  - 2022-07-21 (ano-mes-dia)
 *  - 2022-07-21T15:30 (ano-mes-diaT[Hora:minuto])
 *  - 2022-07-21T15:30:09 (ano-mes-diaT[Hora:minuto:segundo])
 *  - 2022-07-21T15:30:09.1234 (ano-mes-diaT[Hora:minuto:segundo.milisegundo])
 *
 * Data Hora global:
 *  - 2022-07-21T15:30:09Z (ano-mes-diaT[Hora:minuto:segundo]Z)
 *  - 2022-07-21T15:30:09:09.12342356Z (ano-mes-diaT[Hora:minuto:segundo.milisegundo]Z)
 *  - 2022-07-21T15:30:09-03:00 (ano-mes-diaT[Hora:minuto:segundo]UTC-3:00)
*/

public class Datas {

    public static void main(String[] args){

        // ############################################################
        // Instanciando data e hora

        LocalDate d01 = LocalDate.now();
        System.out.println("d01= " + d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("d02= " + d02);

        Instant d03 = Instant.now(); // Data e hora global Hora Londres
        System.out.println("d03= " + d03);

        LocalDate dataEspecifica = LocalDate.of(2022, 7, 21);
        System.out.println("dataEspecifica= " + dataEspecifica);

        LocalDateTime dataEspecificaHora = LocalDateTime.of(2022, 7, 21, 15, 30, 9);
        System.out.println("dataEspecificaHora= " + dataEspecificaHora);


        // ############################################################
        // Instanciando data e hora a partir de texto

        // Texto para Datahora
        LocalDate d04 = LocalDate.parse("2022-07-21");
        System.out.println("d04= " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2022-07-21T15:30:09");
        System.out.println("d05= " + d05);

        // Texto para Datahora global
        Instant d06 = Instant.parse("2022-07-21T15:30:09Z");

        // Texto Customizado para Datahora
        // docs: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d07 = LocalDate.parse("21/07/2022", dtf);
        System.out.println("d07= " + d07);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime d08 = LocalDateTime.parse("21/07/2022 15:30:09", dtf2);
        System.out.println("d08= " + d08);


        // ############################################################
        // Transformando dataHora para texto

        // Datahora para texto
        LocalDateTime ex01 = LocalDateTime.parse("2022-07-21T15:30:09");
        System.out.println("ex01= " + ex01);
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String texto = ex01.format(dtf3);
        System.out.println("texto= " + texto);

        // Datahora global para texto
        Instant ex02 = Instant.parse("2022-07-21T15:30:09Z");
        System.out.println("d10= " + ex02);
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // converter para o fuso horario de Sao Paulo e depois formatar
        String texto2 = ex02.atZone(ZoneId.of("America/Sao_Paulo")).format(dtf4);
        System.out.println("texto2= " + texto2);


        // ############################################################
        // Convertendo dataHora global para local

        // Datahora global para local
        Instant ex03 = Instant.parse("2022-07-21T15:30:09Z");
        System.out.println("ex03= " + ex03);
        LocalDateTime ex04 = LocalDateTime.ofInstant(ex03, ZoneId.of("America/Sao_Paulo"));
        System.out.println("ex04= " + ex04);


        // ############################################################
        // Adicionando e subtraindo tempo

        // Somando dias
        LocalDateTime d09 = LocalDateTime.parse("2022-07-21T15:30:09");
        d09 = d09.plusDays(7);
        System.out.println("d07= " + d09);

        d09 = d09.plusHours(7); // Somando horas
        d09 = d09.plusMonths(7); // Somando meses
        d09 = d09.minusDays(7); // Subtraindo dias
        d09 = d09.plusWeeks(7); // Somando semanas

        // Operacoes com Instant
        Instant dInstant = Instant.parse("2022-07-21T15:30:09Z");
        dInstant = dInstant.minus(7, ChronoUnit.DAYS); // Subtraindo dias
        dInstant = dInstant.plus(7, ChronoUnit.DAYS); // Somando dias

        // Duracao
        Instant dInstant2 = Instant.parse("2022-07-21T15:30:09Z");
        Instant dInstant3 = Instant.parse("2022-07-21T15:30:09Z");
        Duration duracao = Duration.between(dInstant2, dInstant3);
        System.out.println("duracao= " + duracao);

        // Periodo 
        LocalDate dLocalDate = LocalDate.parse("2022-07-21");
        LocalDate dLocalDate2 = LocalDate.parse("2022-07-21");
        Period periodo = Period.between(dLocalDate, dLocalDate2);
        System.out.println("periodo= " + periodo);

        // Comparando datas
        LocalDate dLocalDate3 = LocalDate.parse("2022-07-21");
        LocalDate dLocalDate4 = LocalDate.parse("2022-07-21");
        System.out.println("dLocalDate3.isAfter(dLocalDate4)= " + dLocalDate3.isAfter(dLocalDate4));
        System.out.println("dLocalDate3.isBefore(dLocalDate4)= " + dLocalDate3.isBefore(dLocalDate4));
        System.out.println("dLocalDate3.isEqual(dLocalDate4)= " + dLocalDate3.isEqual(dLocalDate4));


        // ############################################################
        // Extraindo o dia da semana
        LocalDate d10 = LocalDate.parse("2022-07-21");
        System.out.println("d10= " + d10.getDayOfWeek()); // Quinta-feira

        // retornando em numero
        System.out.println("d10= " + d10.getDayOfWeek().getValue()); // 4

        // Obtendo o mes
        System.out.println("d10= " + d10.getMonth()); // JULY
        System.out.println("d10= " + d10.getMonthValue()); // 7

        // Obtendo o ano
        System.out.println("d10= " + d10.getYear()); // 2022

        // Obtendo o dia do mes
        System.out.println("d10= " + d10.getDayOfMonth()); // 21

        // Obtendo o dia do ano
        System.out.println("d10= " + d10.getDayOfYear()); // 202









    }

}
