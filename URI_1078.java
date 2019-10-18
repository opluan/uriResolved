import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {
       
		int tabuada;
		int produto;
		
		Scanner sc = new Scanner(System.in);

		tabuada = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			produto = tabuada * i;
			System.out.println(i + " x " + tabuada + " = " + produto);
		}
		
	}
		
}
