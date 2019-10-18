import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int voltas;
		int placas;
		int placasVistas;
		
		Scanner sc = new Scanner(System.in);
		
		voltas = sc.nextInt();
		placas = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			if (((voltas * placas * i)) % 10 == 0) {
				placasVistas = ((voltas * placas * i) / 10);
			} else {
				placasVistas = ((voltas * placas * i) / 10) + 1;
			}
			
			if (i < 9) {
				System.out.print(placasVistas + " ");
			} else if (i == 9){
				System.out.print(placasVistas);
			}
			
			
			
		}
		
		System.out.println("");
		
	}

}
