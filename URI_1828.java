import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		int rodadas;
		String disputa;
		
		Scanner sc = new Scanner(System.in);

		rodadas = sc.nextInt();
		
		for (int i = 0; i <= rodadas; i++) {
			disputa = sc.nextLine();
			
			if(i == 0) {
				
			}else if(disputa.equals("tesoura papel")) {
				System.out.println("Caso #" + i + ": Bazinga!");
			} else if(disputa.equals("papel pedra")) {
				System.out.println("Caso #" + i + ": Bazinga!");
			} else if(disputa.equals("pedra lagarto")) {
				System.out.println("Caso #" + i + ": Bazinga!");
			} else if(disputa.equals("lagarto Spock")) {
				System.out.println("Caso #" + i + ": Bazinga!");
			} else if(disputa.equals("Spock tesoura")) {
				System.out.println("Caso #" + i + ": Bazinga!");
			} else if(disputa.equals("tesoura lagarto")) {
				System.out.println("Caso #" + i + ": Bazinga!");
			} else if(disputa.equals("lagarto papel")) {
				System.out.println("Caso #" + i + ": Bazinga!");
			} else if(disputa.equals("papel Spock")) {
				System.out.println("Caso #" + i + ": Bazinga!");
			} else if(disputa.equals("Spock pedra")) {
				System.out.println("Caso #" + i + ": Bazinga!");
			} else if(disputa.equals("pedra tesoura")) {
				System.out.println("Caso #" + i + ": Bazinga!");
			} else if(disputa.equals("papel tesoura")) {
				System.out.println("Caso #" + i + ": Raj trapaceou!");
			} else if(disputa.equals("pedra papel")) {
				System.out.println("Caso #" + i + ": Raj trapaceou!");
			} else if(disputa.equals("lagarto pedra")) {
				System.out.println("Caso #" + i + ": Raj trapaceou!");
			} else if(disputa.equals("Spock lagarto")) {
				System.out.println("Caso #" + i + ": Raj trapaceou!");
			} else if(disputa.equals("tesoura Spock")) {
				System.out.println("Caso #" + i + ": Raj trapaceou!");
			} else if(disputa.equals("lagarto tesoura")) {
				System.out.println("Caso #" + i + ": Raj trapaceou!");
			} else if(disputa.equals("papel lagarto")) {
				System.out.println("Caso #" + i + ": Raj trapaceou!");
			} else if(disputa.equals("Spock papel")) {
				System.out.println("Caso #" + i + ": Raj trapaceou!");
			} else if(disputa.equals("pedra Spock")) {
				System.out.println("Caso #" + i + ": Raj trapaceou!");
			} else if(disputa.equals("tesoura pedra")) {
				System.out.println("Caso #" + i + ": Raj trapaceou!");
			} else {
				System.out.println("Caso #" + i + ": De novo!");
			}
		}
		
	}

}
