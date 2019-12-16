import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
	
		int botas;
		int tamanho;
		String lado;
		int par;
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			
			botas = sc.nextInt();
			par = 0;
			
			int botasD[] = new int[botas];
			int botasE[] = new int[botas];
			
			for (int i = 0; i < botas; i++) {
				
				tamanho = sc.nextInt();
				lado = sc.next();
				
				if (lado.equals("D")) {
					
					botasD[i] = tamanho;
					
				} else {
					
					botasE[i] = tamanho;
				}
				
			}
			
			for (int j = 0; j < botas; j++) {
					
				for (int k = 0; k < botas; k++) {
						
//					System.out.println(botasD[j] + ", " + botasE[k]);
					
					if (botasE[k] != 0 && botasD[j] == botasE[k]) {
						
						botasD[j] = 0;
						botasE[k] = 0;
						par++;
							
					}
						
				}
					
			}
				
			System.out.println(par);
			
		}
		
	}
}
