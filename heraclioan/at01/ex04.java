package heraclioan.at01;
import java.util.Scanner;
public class ex04 {
public static void main(String[] args) {
    int note;

    Scanner clavier = new Scanner(System.in);

    System.out.println("entrer la note de l'eleve");
    note = clavier.nextInt();

    if(note > 59)
    {
        System.out.println("l'eleve est en reussite de: " + note);
    }
    else if(note < 59)
    {
        System.out.println("l'eleve est en echec de: " + note);
    }

    clavier.close();
}
}
