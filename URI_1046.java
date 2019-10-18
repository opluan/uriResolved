import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        int horaInicial;
        int horaFinal;
        int duracao;
        
        Scanner sc = new Scanner(System.in);
        
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        
        if ((horaInicial >= 0 && horaInicial <= 24) && (horaFinal >= 0 && horaFinal <= 24)) {
            if (horaInicial > horaFinal || horaInicial == horaFinal) {
               duracao = Math.abs((horaInicial - horaFinal) - 24);
               System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
            } else if (horaInicial < horaFinal) {
                duracao = Math.abs(horaInicial - horaFinal);
                System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
            }
        }
            
    }
 
}
