import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException{
       
       int alunos;
       int matricula = 0;
       int matriculaMaior = 0;
       float nota;
       float notaMaior = 0;
        
       Scanner sc = new Scanner(System.in);
       
       alunos = sc.nextInt();
       
       for(int i = 0; i < alunos; i++) {
    	   matricula = sc.nextInt();
    	   nota = sc.nextFloat();
           
           if(nota > notaMaior) {
               notaMaior = nota;
               matriculaMaior = matricula;
           }
       }
       
       if(notaMaior >= 8) {
           System.out.println(matriculaMaior);
       } else {
           System.out.println("Minimum note not reached");
       }
       
    }
       
}
