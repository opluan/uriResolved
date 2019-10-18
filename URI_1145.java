import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {

		int x;
		int y;
		int z = 1;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		for (int i = 0; i < y; i += x) {
			for (int j = 1; j <= x; j++) {
				System.out.print(z);
				if ( j < x) {
					System.out.print(" ");
				}
				z++;
			}
			
			System.out.println();
		
		}
		
	}
		
}
