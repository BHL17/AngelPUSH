package heraclioan.at01;
import java.util.Scanner;
public class ex01 {
public static void main(String[] args) {    

    Scanner clavier = new Scanner(System.in);
    
    System.out.println("le nombre est elerver de: ");
    int nombre1 = clavier.nextInt();

    System.out.println("le nombre est elerver de: ");
    int nombre2 = clavier.nextInt();

    if(nombre1 > nombre2) {
        System.out.println("le nombre le plus elever:" + nombre1);
    }
    
    else if (nombre2 > nombre1){
        System.out.println("le nombre le plus elever:" + nombre2);
    } 

    clavier.close();






}
}
