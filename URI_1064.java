import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {

		float numeroDigitado;
		float soma = 0;
		int positivo = 0;
		float media = 0;
		
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.0");

		for(int i=0; i < 6; i++) {
			numeroDigitado = sc.nextFloat();
			if(numeroDigitado > 0) {
				soma += numeroDigitado;
				positivo++;
			}
		}
		
		media = soma / positivo;
		
		System.out.println(positivo + " valores positivos");
		System.out.println(decimal.format(media));
		
	}

}
