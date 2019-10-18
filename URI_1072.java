import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {
       
		int inteiros;
		int numero;
		int dentro = 0;
		int fora = 0;
		
		Scanner sc = new Scanner(System.in);

		inteiros = sc.nextInt();
		
		for (int i = 0; i < inteiros; i++) {
			numero = sc.nextInt();
			
			if (numero >= 10 && numero <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		
		System.out.println(dentro + " in");
		System.out.println(fora + " out");
		
	}
		
}
