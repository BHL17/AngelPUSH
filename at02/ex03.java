package heraclioab.at02;
import java.util.Scanner;
public class ex03 {
public static void main(String[] args) {
     
    int compteur = 0;
        
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un mot ou une phrase  : ");
        String phrase = clavier.nextLine();

        

        for(int i = 0; i < phrase.length(); i++)
        if (phrase.charAt(i) == 'a') 
        {
            compteur++;
        }
          
        String phraseFinal = phrase.replace('a', '$');

        String Maj = phraseFinal.toUpperCase();

        System.out.print("La phrase final est   : " + Maj);



        
        clavier.close();
}
}
