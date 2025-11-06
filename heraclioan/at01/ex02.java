package heraclioan.at01;
import java.util.Scanner;
public class ex02 {
public static void main(String[] args) {
    double SalaireHoraire;
    double Salaireparquinzine;
    double SalaireparSemaine;
    int QuinzaineSalaire = 2;


    Scanner clavier = new Scanner(System.in);

    System.out.print("entre le salaire par semaine");
     SalaireparSemaine = clavier.nextDouble();

    System.out.print("entre le salaire par horaire");
    SalaireHoraire = clavier.nextDouble();
    
    Salaireparquinzine = SalaireHoraire * SalaireparSemaine * SalaireparSemaine * QuinzaineSalaire;
    System.out.println("le salaire par quinzine est de " + Salaireparquinzine);

    clavier.close();



}
}
