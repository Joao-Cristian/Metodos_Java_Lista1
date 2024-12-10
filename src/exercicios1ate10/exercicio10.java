package exercicios1ate10;

public class exercicio10 {
	public static double CalcularMedia(double primeiroNumero, double segundoNumero, double terceiroNumero) {
		return (primeiroNumero + segundoNumero + terceiroNumero) / 3;
	}

	public static void main(String[] args) {
		double resultado = CalcularMedia(9.5, 4.2, 5.1);
		
		System.out.println("A media dos numeros e: " + resultado);
	}

}
