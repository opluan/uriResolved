import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {

		int i = 1;
		int j = 7;
		int k;
		int l;
		
		Scanner sc = new Scanner(System.in);

		for (k = 0; k <= 9; k += 2) {
			for (l = 0; l < 3; l++) {
				System.out.println("I=" + i + " J=" + j);
				j--;;
			}
			
			i += 2;
			j += 5;
		}
		
	}
		
}
