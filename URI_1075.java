import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
	
public class Main {
 
	public static void main(String[] args) throws IOException {

		int divisor;
		int quociente;
		
		Scanner sc = new Scanner(System.in);
		
		divisor = sc.nextInt();
		
		for (int i = 1; i < 10000; i++) {
			if (i % divisor == 2) {
				quociente = i;
				System.out.println(quociente);
			}
			
		}
		
	}
		
}
