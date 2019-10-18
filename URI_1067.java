import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {
       
		int numero;
		int impar = 1;
		
		Scanner sc = new Scanner(System.in);

		numero = sc.nextInt();
		
		for (int i = numero; i > 0; i -= 2) {
			System.out.println(impar);
			impar += 2;
		}
		
	}
		
}
