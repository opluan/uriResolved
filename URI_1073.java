import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {
       
		int maximo;
		int numero = 2;
		int quadrado;
		
		Scanner sc = new Scanner(System.in);

		maximo = sc.nextInt();
		
		for (int i = maximo; i > 1; i -= 2) {
			quadrado = (int)Math.pow(numero, 2);
			System.out.println(numero + "^2 = " + quadrado);
			numero += 2;
		}
		
	}
		
}
