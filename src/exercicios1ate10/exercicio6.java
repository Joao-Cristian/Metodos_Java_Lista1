package exercicios1ate10;

public class exercicio6 {
	public static boolean EhPar(int numero) {
		return numero % 2 == 0;
	}
	
	public static void main(String[] args) {
		int numeroTeste = 10;
		boolean resultado = EhPar(numeroTeste);
		
		if (resultado) {
			System.out.println(numeroTeste + " e par");
		} else {
			System.out.println(numeroTeste + " e impar");
		}

	}
}
