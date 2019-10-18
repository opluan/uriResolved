import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        int horaInicial;
        int minutoInicial;
        int horaFinal;
        int minutoFinal;
        int duracaoHora;
        int duracaoMinuto;
        
        Scanner sc = new Scanner(System.in);
        
        horaInicial = sc.nextInt();
        minutoInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minutoFinal = sc.nextInt();

        if(horaFinal < horaInicial) {
        	horaFinal += 24;
        }
        if(minutoFinal < minutoInicial) {
        	horaFinal -= 1;
        	minutoFinal += 60;
        }
        
        duracaoHora = horaFinal - horaInicial;
        duracaoMinuto = minutoFinal - minutoInicial;
        
        if(duracaoHora == 0 && duracaoMinuto == 0) {
        	duracaoHora = 24;
        }
        
      System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMinuto +
		" MINUTO(S)");
        
    }
 
}
