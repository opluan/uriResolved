import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
	
public class Main {
 
	public static void main(String[] args) throws IOException {

		int idade;
		int soma = 0;
		double media = 0.0;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		for (int i = 0; i > -1; i++) {
			idade = sc.nextInt();
			
			if (idade >= 0) {
				soma += idade;
			} else {
				media = (double)soma / i;
				break;
			}
			
		}
		
		System.out.println(decimal.format(media));
		
	}
		
}
