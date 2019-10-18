import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {

		int i = 1;
		int j;
		
		Scanner sc = new Scanner(System.in);

		for (j = 60; j >= 0; j -= 5) {
			System.out.println("I=" + i + " J=" + j);
			i += 3;
		}
		
	}
		
}
