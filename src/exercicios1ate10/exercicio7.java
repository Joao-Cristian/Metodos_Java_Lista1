package exercicios1ate10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class exercicio7 {
	
		public static String ObterDataAtual() {
			LocalDate dataAtual = LocalDate.now();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			return dataAtual.format(formato);
		}

		public static void main(String[] args) {
			String data = ObterDataAtual();
			System.out.println("A data atual e: " + data);
		}
}
