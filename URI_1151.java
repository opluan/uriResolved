import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {

		int sequencia;
		int ultimo = 1;
		int penultimo = 0;
		int proximo;
		
		Scanner sc = new Scanner(System.in);
		
		sequencia = sc.nextInt();
		
		System.out.print(penultimo + " " + ultimo + " ");
		
		for (int i = 0; i < sequencia - 2; i++) {
			proximo = penultimo + ultimo;
			penultimo = ultimo;
			ultimo = proximo;
			
			System.out.print(proximo);
			
			if (i < sequencia - 3) {
				System.out.print(" ");
			}
		}
		
		System.out.println();
			
	}
		
}
