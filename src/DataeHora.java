import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataeHora {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2023-10-19");
		LocalDateTime d02 = LocalDateTime.parse("2023-08-16T19:26:25");
		Instant d03 = Instant.parse("2023-10-19T19:26:55Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		
		System.out.println("d01 = " + d01.format(fmt1));
		
		System.out.println("d02 = " + d02.format(fmt1));
		System.out.println("d02 = " + d02.format(fmt2));
		
		System.out.println("d03 = " + fmt3.format(d03));
		
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault()); // fuso do computador
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal")); // fuso de portugal
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		
		System.out.println("d01 dia = " + d01.getDayOfMonth());
		System.out.println("d01 mês = " + d01.getMonthValue());
		System.out.println("d01 ano = " + d01.getYear());
		
		System.out.println();
		
		// pegar qualquer tipo de data (dia mes ano e hora min seg 
		System.out.println("d02 hora = " + d02.getHour());
		System.out.println("d02 minutos = " + d02.getMinute());

		//AUMENTAR E DIMINUIR
		LocalDate semana_passada = d01.minusDays(7);
		LocalDate proxima_semana = d01.plusDays(7);
		
		System.out.println();
		
		System.out.println("semana_passada = " + semana_passada);
		System.out.println("proxima_semana = " + proxima_semana);
		
		// adicionar/diminuir a data no Instant(data/hora que tenha fuso)
		Instant semana_passada_instant = d03.minus(7, ChronoUnit.DAYS);
		Instant proxima_semana_instant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println();
		
		System.out.println("semana_passada = " + semana_passada_instant);
		System.out.println("proxima_semana = " + proxima_semana_instant);
		
		// transformar o LocalDate em LocalDateTime
		Duration t1 = Duration.between(semana_passada.atStartOfDay(), d01.atStartOfDay());
		
		System.out.println("t1 dias = " + t1.toDays());
	}

}
