import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {

		int n;
		int fatorial = 1;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for (int i = n; i >=1; i--) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
			
	}
		
}
