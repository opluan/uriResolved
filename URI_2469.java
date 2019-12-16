import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
	
		int alunos;
		int nota;
		int moda[] = new int[101];
		int maiorNota = 0;
		
		Scanner sc = new Scanner(System.in);
		
		alunos = sc.nextInt();

		for (int i = 0; i < alunos; i++) {
			
			nota = sc.nextInt();
			
			for (int j = 0; j <= 100; j++) {
				moda[nota] = (moda[nota] + 1) % 10;
			}
		}
		
		for (int i = 0; i <= 100; i++) {
			if (moda[i] >= moda[maiorNota]) {
				maiorNota = i;
			}
		}
		
		System.out.println(maiorNota);
		
	}
}
