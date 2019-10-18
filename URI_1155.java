import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		float s = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i  = 1; i <= 100; i++) {
			s += 1/(float)i;
		}
		
		System.out.printf("%2.2f", s);
		System.out.println("");
		
	}
	
}
