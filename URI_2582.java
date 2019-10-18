import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		String[] musica = new String[11];
		int tocadas;
		int i = 0;
		int botao1;
		int botao2;
		
		Scanner sc = new Scanner(System.in);
		
		tocadas = sc.nextInt();
		
		musica[0] = "PROXYCITY";
		musica[1] = "P.Y.N.G.";
		musica[2] = "DNSUEY!";
		musica[3] = "SERVERS";
		musica[4] = "HOST!";
		musica[5] = "CRIPTONIZE";
		musica[6] = "OFFLINE DAY";
		musica[7] = "SALT";
		musica[8] = "ANSWER!";
		musica[9] = "RAR?";
		musica[10] = "WIFI ANTENNAS";
		
		while(i < tocadas) {
			botao1 = sc.nextInt();
			botao2 = sc.nextInt();
			System.out.println(musica[botao1 + botao2]);
			i++;
		}
		
	}
	
}
