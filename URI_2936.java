import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int curupira;
		int Boitata;
		int boto;
		int mapinguari;
		int iara;
		int mandiocas;
		
		Scanner sc = new Scanner(System.in);
		
		curupira = sc.nextInt();
		Boitata = sc.nextInt();
		boto = sc.nextInt();
		mapinguari = sc.nextInt();
		iara = sc.nextInt();
		
		mandiocas = (curupira * 300) + (Boitata * 1500) + (boto * 600) + (mapinguari * 1000) + (iara * 150)
				+ 225;
		
		System.out.println(mandiocas);
		
	}

}
