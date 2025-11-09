package heraclioab.at02;
import java.util.Scanner;
public class ex02 {
public static void main(String[] args) {
     Scanner clavier = new Scanner(System.in);

      System.out.print("Entrez un mot ou une phrase  : ");
      String phrase = clavier.nextLine();

      int nbcharachtere = phrase.length();

      System.out.print("Le nombre de charachtère est   : "  + nbcharachtere );

      clavier.close();
}
}
