import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int idade; // em dias
        int anos; // 365 dias
        int meses; // 30 dias
        int dias;
        int resto;
        
        Scanner sc = new Scanner(System.in);
        
        idade = sc.nextInt();
        anos = idade / 365;
        resto = idade % 365;
        meses = resto / 30;
        resto = resto % 30;
        dias = resto;
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        
    }
 
}
