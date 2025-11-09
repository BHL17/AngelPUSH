package heraclioab.at02;
import java.util.Scanner;
public class ex05 {
public static void main(String[] args) {
   Scanner clavier = new Scanner(System.in);

        System.out.println("Alphabet à l'endroit :");
        for (char cChar = 'A'; cChar <= 'Z'; cChar++)
        {
            System.out.print(cChar + " ");
        }

        System.out.println("\nAlphabet à l'envers :");

        for (char cChar = 'Z'; cChar >= 'A'; cChar--) 
        {
            System.out.print(cChar + " ");
        }

        clavier.close(); 
}
}
