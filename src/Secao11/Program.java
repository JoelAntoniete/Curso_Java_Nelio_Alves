package Secao11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {
        //trabalhando com hora e data

        //intanciar a hora atual
        LocalDate d01 = LocalDate.now(); //intancia a data atual
        System.out.println(d01);

        LocalDateTime d02 = LocalDateTime.now(); //intancia a hora e data atual
        System.out.println(d02);

        Instant d03 = Instant.now(); //ele intancia o momento exato usando zulutime
        System.out.println(d03);

        //instanciar uma hora apartir do texto
        LocalDate d04 = LocalDate.parse("2017-08-30"); //transformamos uma string em um objeto data
        System.out.println(d04);

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:50:26"); //transformamos uma string em um objeto data e hora
        System.out.println(d05);

        Instant d06 = Instant.parse("2022-07-20T01:50:26Z");
        System.out.println(d06);

        //transformar a hora do brasil em zulutime
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); //temos que usar o nosso utc segundo a ISO8601
        System.out.println(d07);

        //transformar um texto de formato custumizado em data hora
        //LocalDate teste  = LocalDate.parse("29/09/2023"); //se colocamos apenas assim ele nao funciona, precisamos de um formatter

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08  = LocalDate.parse("29/09/2023",fmt1);
        System.out.println(d08);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("29/09/2023 12:04", fmt2);
        System.out.println(d09);

        //podemos instanciar o formatter direto no local e localdate
        LocalDateTime d10 = LocalDateTime.parse("29/09/2023 12:04", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(d10);


        //instaciar dias mes e ano separadamente
        LocalDate d11 = LocalDate.of(2023,9,29);
        System.out.println(d11);

        LocalDateTime d12 = LocalDateTime.of(2023,9,29,12,04);
        System.out.println(d12);

        //formatacao, tarnformar data em texto
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d04.format(f1)); //podemos colocar o formatter direto no objeto
        System.out.println(f1.format(d04)); //podemos colocar o objeto direto no formatter
        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(d05.format(f2)); //imprimimos data e hora
        System.out.println(d05.format(f1)); //se usarmos um formatter sem hora ele imprime apenas a data

        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        //como o instant é um horario mundio é necessario o usao de um fuso horario
        //usando o systemdefault ele pega o fuso horario do sistema operacional
        System.out.println(f3.format(d06));

        //podemos usar os formatos padroes
        DateTimeFormatter f4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter f5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println(f3.format(d06));
        System.out.println(f5.format(d06));
        System.out.println(d06.toString());

        //converter uma data hora global para local
        LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault()); //ele pega um instant e um zoneid e transforma um objeto localdate
        System.out.println(r1);

        LocalDate r2 = LocalDate.ofInstant(d06,ZoneId.of("Portugal")); //podemos passar a regiao que esteja na lista do zoneid
        System.out.println(r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());
        System.out.println(r3);

        LocalDateTime r4 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));
        System.out.println(r3);

        //obter dados do datahora separados
        System.out.println(d04.getDayOfMonth()); //pegar o dia
        System.out.println(d04.getMonthValue());
        System.out.println(d04.getYear());

        System.out.println(d05.getHour()); //pegar a hora
        System.out.println(d05.getMinute());

        //calculos com datahora

        LocalDate pastWeek = d04.minusDays(7); //diminuir 7 dias
        System.out.println(pastWeek);

        LocalDate nextWeek = d04.plusDays(7); //acrescentar 7 dias
        System.out.println(nextWeek);

        LocalDateTime hour = d05.plusHours(5);
        System.out.println(hour);

        LocalDateTime hourMinus = d05.minusHours(5);
        System.out.println(hourMinus);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        //pra fazer a mudanca precisamos usar o chronoUniti com o que quizermos, dia, mes ano , hora etc
        System.out.println(pastWeekInstant);

        Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);
        System.out.println(nextWeekInstant);

        //duracao entre duas datahoras

        Duration t1 = Duration.between(hourMinus, d05); //mostra a diferenca d e horas no LocalDasteTime
        System.out.println("Duratio = " + t1);

        //caso queiramos usar um Localdate precisamos transormar em um LocalDateTime
        Duration t2 = Duration.between(nextWeek.atTime(0,0), d04.atTime(0,0)); //atTime coloca 0 horas e 0 minutos, tranformando em lOcalDateTime
        System.out.println(t2);

        Duration t2b = Duration.between(nextWeek.atStartOfDay(), d04.atStartOfDay()); //podemos fazer desta maneira mais simples
        System.out.println(t2b);

        Duration t3 = Duration.between(pastWeekInstant,d06);
        System.out.println(t3);

        //usando a classe date

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//pra creiar um formato com time xzone vc primeiro cria o formato
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));//depois voce acrescenta o timezone

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");

        System.out.println("Date = " + y1);
        System.out.println(y2);

        System.out.println(sdf2.format(y1)); //ele imprime usando o formato do sdf2
        System.out.println(sdf2.format(y2));

        Date x1 = new Date(); //vai pegar a dta e hora atual
        System.out.println(sdf2.format(x1));

        Date x2 = new Date(System.currentTimeMillis()); //converte o instante em milissegundos
        System.out.println(x2);

        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(y3);

        //usando o sdf3 que acrescenta o timezonena hora de criar a hora
        System.out.println(sdf3.format(y1));
        System.out.println(sdf3.format(y2));
        System.out.println(sdf3.format(y3));

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4); //acrescentar 4 horas

        d = cal.getTime();// pegar apenas o tempo
        System.out.println(sdf.format(d));

        int minutos = cal.get(Calendar.MINUTE);
        System.out.println(minutos);
        System.out.println(cal.get(Calendar.MONTH) + 1); //o mes comeca com zero, precisando que a gente acrescente 1 numero

    }
}
