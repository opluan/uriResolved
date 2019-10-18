import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {
       
		int numero;
		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			numero = sc.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			
			if (numero > 0) {
				positivo++;
			} else if (numero < 0){
				negativo++;
			}
			
		}
		
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		
	}
		
}
