package heraclioab.at02;
import java.util.Scanner;
public class ex04 {
public static void main(String[] args) {
    int valeur;

        Scanner clavier = new Scanner(System.in);
        do 
        {
            System.out.print("Entrez une valeur entre 0 et 100 : ");
            valeur = clavier.nextInt();
        } while (valeur < 0 || valeur > 100);

        clavier.close();
}
}
