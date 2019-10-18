import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int membros;
		String nome;
		int anoes = 0;
		int elfos = 0;
		int humanos = 0;
		int magos = 0;
		int hobbits = 0;
		
		Scanner sc = new Scanner(System.in);
		
		membros = sc.nextInt();
		
		for (int i = 0; i <= membros; i++) {
			nome = sc.nextLine();
			
			if (nome.endsWith("A")) {
				anoes++;
			} else if (nome.endsWith("E")) {
				elfos++;
			} else if (nome.endsWith("H")) {
				humanos++;
			} else if (nome.endsWith("M")) {
				magos++;
			} else if (nome.endsWith("X")) {
				hobbits++;
			}
		}
		
		System.out.println(hobbits + " Hobbit(s)");
		System.out.println(humanos + " Humano(s)");
		System.out.println(elfos + " Elfo(s)");
		System.out.println(anoes + " Anao(s)");
		System.out.println(magos + " Mago(s)");
		
	}

}
