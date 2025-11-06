package heraclioan.at01;
import java.util.Scanner;
public class ex03 {
public static void main(String[] args) {
    int age1;
    int age2;
    int moyenne;

    Scanner clavier = new Scanner(System.in);

    System.out.println("entrer l'age de la premier personne: ");
    age1 = clavier.nextInt();

    System.out.println("entrer l'age de la deuxieme personne: ");
    age2 = clavier.nextInt();

    moyenne = (age1+age2)/2;
    System.out.println("la moyenne des deux age: " + moyenne);

    if(age1 > age2)
    {
        System.out.println("la premiere personne est plus ager: " + age1);
    }
    else if (age2 > age1) 
    {
        System.out.println("la deuxieme personne est plus ager: " + age2); 
    }
    else
    {
        System.out.println("les deux personnes au le meme age: ");
    }

    clavier.close();


}
}
