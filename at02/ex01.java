package heraclioab.at02;
import java.util.Scanner;
public class ex01 {
public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);

      System.out.print("Entrez un mot ou une phrase  : ");
      String phrase = clavier.nextLine();

      String Maj = phrase.toUpperCase();

      System.out.print("Le texte en majuscule est  : " + Maj);

      clavier.close();
}
}
