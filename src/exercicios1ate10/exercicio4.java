package exercicios1ate10;

public class exercicio4 {
	public static int Soma(int primeiroNumero, int segundoNumero) {
		return primeiroNumero * segundoNumero;
	}
	
	public static void main(String[] args) {
		int resultado = Soma(4, 4);
		System.out.println("O resultado da multiplicacao dos dois números e: " + resultado);
	}
}