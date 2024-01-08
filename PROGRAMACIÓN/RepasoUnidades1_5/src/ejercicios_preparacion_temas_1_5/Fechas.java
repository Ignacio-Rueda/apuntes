package ejercicios_preparacion_temas_1_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Fechas {

	public static void main(String[] args) {
		/**
		 * En el paquete java.time (dentro de java base ) tenemos las clases relativas
		 * al tiempo: LocalDate | LocalTime | LocalDateTime. En el paquete
		 * java.time.format (dentro de java base ) contiene la clase DateTimeFormatter
		 * por si necesitamos dar formato a las fechas.
		 * 
		 * ISO_LOCAL_DATE puede utilizarse con LocalDate y LocalDateTime (contiene una
		 * fecha). ISO_LOCAL_TIME puede utilizarse con LocalTime y LocalDateTime
		 * (contiene una hora). ISO_LOCA_DATE_TIME solo puede utilizarse con
		 * LocalDateTime (contiene una fecha y una hora).
		 */

		// LAS CLASES RELATIVAS AL TIEMPO EN JAVA UTILIZAN MÉTODOS ESTÁTICOS.

		// -------------------------------------------------------------------------
		// FECHAS LocalDate
		// -------------------------------------------------------------------------
		System.out.printf("FECHAS CON LocalDate %n");
		// ->Obtener fecha actual
		LocalDate fechaActual = LocalDate.now();
		System.out.printf("Fecha actual %s%n", fechaActual);

		// ->Crear una fecha.
		LocalDate fechaPersonalizada = LocalDate.of(2001, 01, 30);
		System.out.printf("Fecha personalizada %s%n", fechaPersonalizada);

		// ->Crear una fecha usando el enumerado Month para dar legibilidad al código.
		fechaPersonalizada = LocalDate.of(2023, Month.APRIL, 25);// Hace falta importar time.Month
		System.out.printf("Fecha personalizado usando ENUM %s%n", fechaPersonalizada);

		// ->Se puede emplear el método parse para crear un objeto del tipo LocalDate a
		// partir de la cadena de texto.
		// ->Admite dos argumentos: cadena de texto que quieres transformar, objeto
		// DateTimeFormatter que le va a decir al método parse, como aparece la fecha
		// expresada en la cadena de texto.

		fechaPersonalizada = LocalDate.parse("2023-03-05"); // 2023-3-5 Daría error.
		System.out.printf("Fecha personalizada usando MÉTODO PARSE %s%n", fechaPersonalizada);

		// ->Aplicando formato a la fecha con DateTimeFormatter.
		fechaPersonalizada = LocalDate.parse("2023-03-05", DateTimeFormatter.ISO_DATE);
		System.out.printf("Fecha personalizada MÉTOD PARSE + DATETIMEFORMATTER %s%n", fechaPersonalizada);

		// ->Restar fechas
		LocalDate fechaRestada = fechaPersonalizada.minusMonths(1);
		System.out.printf("RESTA de un mes a una fecha dada: %s%n", fechaRestada);
		// ->Sumar fechas
		LocalDate fechaSumada = fechaPersonalizada.plusDays(35);
		System.out.printf("SUMA de 35 días a una feca dada %s%n", fechaSumada);

		// ------------------------------------------------------------------------------------------
		// HORAS LocalTime
		// ------------------------------------------------------------------------------------------
		System.out.printf("%nHORAS CON LocalTime %n");

		// ->Obtener hora actual.
		LocalTime horaActual = LocalTime.now();
		System.out.printf("Hora actual : %s%n", horaActual);

		// ->Crear una hora personalizada.
		LocalTime horaPersonalizada = LocalTime.of(13, 20, 10);
		System.out.printf("Hora personalizada : %s%n", horaPersonalizada);

		// ->Crear una hora empleando el método parse.
		horaPersonalizada = LocalTime.parse("13:21:10");
		System.out.printf("Hora personalizada usando MÉTODO PARSE %s%n", horaPersonalizada);

		// ->Aplicando formato a la hora con DateTimeFormatter.
		horaPersonalizada = LocalTime.parse("13:21:21", DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.printf("Hora personalizada usando MÉTODO PARSE + DATETIMEFORMATTER %s%n", horaPersonalizada);

		// ------------------------------------------------------------------------------------------
		// FECHA Y HORAS LocalDateTime
		// ------------------------------------------------------------------------------------------
		System.out.printf("%nFECHA Y HORA CON LocalDateTime %n");

		// ->Obtener fecha y hora actual.
		LocalDateTime fechaYhoraActual = LocalDateTime.now();
		System.out.printf("Fecha y hora actual %s%n", fechaYhoraActual);

		// Construir un LocalDateTime.
		LocalDate fechaHoy = LocalDate.now();
		LocalTime horaHoy = LocalTime.of(20, 15);

		LocalDateTime construccionFecha = LocalDateTime.of(fechaHoy, horaHoy);
		System.out.printf("Fecha y hora personalizada %s%n", construccionFecha);

		// Crear una fecha y hora empleando el método parse.
		construccionFecha = LocalDateTime.parse("2024-11-08T18:34:34.0");
		System.out.printf("Hora y fecha personalizada usando MÉTOD PARSE %s%n", construccionFecha);

		// ->Aplicando formato a la hora con DateTimeFormatter.
		construccionFecha = LocalDateTime.parse("2024-11-08T18:34:34.0", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.printf("Hora personalizada usando MÉTODO PARSE + DATETIMEFORMATTER %s%n", construccionFecha);

		// ------------------------------------------------------------------------------------------
		// MÉTODO PATTERN PARA DAR FORMATO TANTO A LocalDate | LocalTime | LocalDateTime
		// ------------------------------------------------------------------------------------------

		LocalTime horaActualFormateoPersonalizado = LocalTime.now();
		DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofPattern("'Son las:' HH 'y' mm 'minutos'");
		System.out.println(horaActualFormateoPersonalizado.format(formatoPersonalizado));

		LocalDate fechaActuaFormateoPersonalizado = LocalDate.now();
		DateTimeFormatter formatoFechaPersonalizado = DateTimeFormatter
				.ofPattern("'Hoy estamos a 'dd 'del mes' MMMM 'del año' YY");
		System.out.println(fechaActuaFormateoPersonalizado.format(formatoFechaPersonalizado));

		System.out.println(
				fechaActuaFormateoPersonalizado.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

		// ------------------------------------------------------------------------------------------
		// ENUMERADO ChronoUnit
		// ------------------------------------------------------------------------------------------

		DateTimeFormatter formateadoParaChrono = DateTimeFormatter.ofPattern("dd - MMMM - YYYY");
		LocalDate semanaSig = LocalDate.now().plus(1, ChronoUnit.WEEKS);
		System.out.println("Una semana después: " + semanaSig.format(formateadoParaChrono));

		LocalDate mesSig = LocalDate.now().plus(1, ChronoUnit.MONTHS);
		System.out.println("Una mes después: " + mesSig.format(formateadoParaChrono));

		LocalDate anioSig = LocalDate.now().plus(1, ChronoUnit.YEARS);
		System.out.println("Un año después: " + anioSig.format(formateadoParaChrono));

		// -------------------------------------------------------------------------------------------------------
		// Period para obtener la diferencia entre dos fechas o utilizarlo para modificar valores de alguna fecha
		LocalDate fechaHoyDia = LocalDate.now();
		LocalDate fechaCumple = LocalDate.of(2024, 10, 26);
		Period periodo = Period.between(fechaHoyDia, fechaCumple);
		System.out.printf("Quedan %s días %s meses %s años %n",periodo.getDays(),periodo.getMonths(),periodo.getYears());
		
		//Podemos obtenerlo directamente en días totales
		long periodoEnDias = ChronoUnit.DAYS.between(fechaHoyDia, fechaCumple);
		System.out.printf("Número de días totales: %s días%n",periodoEnDias);
		long periodEnMeses = ChronoUnit.MONTHS.between(fechaHoyDia, fechaCumple);
		System.out.printf("Número de meses en total %s meses%n",periodEnMeses);
	}

}
