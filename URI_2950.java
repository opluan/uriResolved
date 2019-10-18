import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int distanciaPalantir;
		int diametroPalantirSauron;
		int diametroPalantirSaruman;
		double interferenciaDeComunicaçãoMagica;
		
		Scanner sc = new Scanner(System.in);
		
		distanciaPalantir = sc.nextInt();
		diametroPalantirSauron = sc.nextInt();
		diametroPalantirSaruman = sc.nextInt();
		
		interferenciaDeComunicaçãoMagica = (double)distanciaPalantir / (diametroPalantirSauron
				+ diametroPalantirSaruman);
		
		System.out.printf("%2.2f\n", interferenciaDeComunicaçãoMagica);
		
	}

}
