import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {

		int linhas;
		
		Scanner sc = new Scanner(System.in);
		
		linhas = sc.nextInt();
		
		for (int i = 1; i <= linhas; i++) {
			System.out.println(i + " " + (int)Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
		}
		
	}
		
}

