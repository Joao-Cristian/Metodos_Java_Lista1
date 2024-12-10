package exercicios1ate10;

public class exercicio9 {
	public static String ConcatenarStrings(String string1, String string2) {
		return string1 + string2;
	}
	
	public static void main(String[] args) {
		
		String resultado = ConcatenarStrings("Bem-", "vindo!");
		
		System.out.println("Resultado da concatena��o: " + resultado);
		
	}
}
