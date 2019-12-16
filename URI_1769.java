import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
	
		String cpfString;
		int cpfCasas[] =  new int[11];
		int digVerifica1;
		int digVerifica2;
		int controle;
				
		Scanner sc = new Scanner(System.in);
			
		while (sc.hasNext()) {
			
			controle = 0;
			cpfString = sc.next();
			
			cpfString = cpfString.replace(".", "");
			cpfString = cpfString.replace("-", "");
					
			for (int i = 0; i < 11; i++) {
				
				cpfCasas[i] = Integer.valueOf(cpfString.substring(i, i+1));
			}
			
			for (int i = 0, j = 1; i < 9; i++, j++) {
				digVerifica1 = cpfCasas[i] * j;
				controle += digVerifica1;
			}
			
			digVerifica1 = controle%11;
			if(digVerifica1 == 10) {
				digVerifica1 = 0;
			}
						
			controle = 0;
			
			for (int i = 0, j = 9; i < 9; i++, j--) {
				digVerifica2 = cpfCasas[i] * j;
				controle += digVerifica2;
			}
			
			digVerifica2 = controle%11;
			if(digVerifica2 == 10) {
				digVerifica2 = 0;
			}
			
			if(digVerifica1 == cpfCasas[9] && digVerifica2 == cpfCasas[10]) {
				System.out.println("CPF valido");
			} else {
				System.out.println("CPF invalido");
			}
		}		
	}
}
