import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
	
public class Main {
 
	public static void main(String[] args) throws IOException {

		int divisoes;
		int x;
		int y;
		float quociente;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.0");
		
		divisoes = sc.nextInt();
		
		for (int i = 0; i < divisoes; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				quociente = (float)x / y;
				System.out.println(decimal.format(quociente));
			}
		}
		
	}
		
}
