import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {

		int leituras;
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		leituras = sc.nextInt();
		
		for (int i = 0; i < leituras; i++) {
			numero = sc.nextInt();
			
			if (numero % 2 == 0) {
				if (numero > 0) {
					System.out.println("EVEN POSITIVE");
				} else if (numero < 0) {
					System.out.println("EVEN NEGATIVE");
				} else {
					System.out.println("NULL");
				}
			} else {
				if (numero > 0) {
					System.out.println("ODD POSITIVE");
				} else {
					System.out.println("ODD NEGATIVE");
				}
			}
			
		}
		
	}
	
}
