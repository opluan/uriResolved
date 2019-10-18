import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int quantidadeCitada;
		String tipo;
		int valor;
		int gasto = 0;
		int verba = 0;
		
		Scanner sc = new Scanner(System.in);
		
		quantidadeCitada = sc.nextInt();
		
		for (int i = 1; i <= quantidadeCitada; i++) {
			tipo = sc.next();
			valor = sc.nextInt();
			if (tipo.equals("G")) {
				gasto += valor;
			} else if (tipo.equals("V")) {
				verba += valor;
			}
		}
		
		if (gasto > verba) {
			System.out.println("NAO VAI TER CORTE, VAI TER LUTA!");
		} else if (verba >= gasto) {
			System.out.println("A greve vai parar.");
		}
	}

}
