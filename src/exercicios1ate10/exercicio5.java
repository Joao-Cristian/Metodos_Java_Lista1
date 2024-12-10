package exercicios1ate10;

public class exercicio5 {
	public static int NumeroMaior(int primeiroNumero, int segundoNumero) {
		if (primeiroNumero > segundoNumero) {
			return primeiroNumero;
		} else {
			return segundoNumero;
		}
	}

	public static void main(String[] args) {
		
		int maior = NumeroMaior(10, 5);
		System.out.println("O maior numero e: "+ maior);
	}
}
