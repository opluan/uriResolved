import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {

		int x;
		int maior = 0;
		int posicao = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 100; i++) {
			x = sc.nextInt();
			
			if ( x > maior) {
				maior = x;
				posicao = i;
			}
		}
		
		System.out.println(maior);
		System.out.println(posicao);
		
	}
		
}
