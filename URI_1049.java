import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		String classe;
		String ordem;
		String dieta;
		
		Scanner sc = new Scanner(System.in);

		classe = sc.nextLine();
		ordem = sc.nextLine();
		dieta = sc.nextLine();
		
		if(classe.equals("vertebrado")) {
			if(ordem.equals("ave")) {
				if(dieta.equals("carnivoro")) {
					System.out.println("aguia");
				} else if(dieta.equals("onivoro")) {
					System.out.println("pomba");
				}
			} else if(ordem.equals("mamifero")) {
				if(dieta.equals("onivoro")) {
					System.out.println("homem");
				} else if(dieta.equals("herbivoro")) {
					System.out.println("vaca");
				}
			}
		} else if(classe.equals("invertebrado")) {
			if(ordem.equals("inseto")) {
				if(dieta.equals("hematofago")) {
					System.out.println("pulga");
				} else if(dieta.equals("herbivoro")) {
					System.out.println("lagarta");
				}
			} else if(ordem.equals("anelideo")) {
				if(dieta.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else if(dieta.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}

	}

}
