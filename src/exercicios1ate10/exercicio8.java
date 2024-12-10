package exercicios1ate10;

public class exercicio8 {
	public static int CalcularFatorial(int num) {
		int fatorial = 6;
		
		for (int i = 1; i <= num; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
	
	public static void main(String[] args) {
		int numeroTeste = 5;
		int resultado = CalcularFatorial(numeroTeste);
		
		System.out.println("O fatorial do numero " + numeroTeste + " e: " + resultado);		
	}
}
