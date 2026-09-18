import java.util.Scanner;

public class MadLib {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective1 = sc.nextLine();

        System.out.print("Enter an animal: ");
        String animal = sc.nextLine();

        System.out.print("Enter a place: ");
        String place = sc.nextLine();

        System.out.print("Enter a noun: ");
        String noun1 = sc.nextLine();

        System.out.print("Enter a verb: ");
        String verb1 = sc.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective2 = sc.nextLine();

        System.out.print("Enter a person: ");
        String person = sc.nextLine();

        System.out.print("Enter a verb ending with -ing: ");
        String verb2 = sc.nextLine();

        System.out.print("Enter an emotion: ");
        String emotion = sc.nextLine();

        System.out.print("Enter a verb: ");
        String verb3 = sc.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective3 = sc.nextLine();

        System.out.print("Enter a noun: ");
        String noun2 = sc.nextLine();

        System.out.println("\n--- Your Mad Lib Story ---");

        System.out.println("One day, a " + adjective1 + " " + animal +
                " went to the " + place + ".");

        System.out.println("It saw a " + noun1 +
                " and decided to " + verb1 + " it.");

        System.out.println("Suddenly, a " + adjective2 + " " + person +
                " appeared and started " + verb2 + ".");

        System.out.println("Everyone became " + emotion +
                " and began to " + verb3 + ".");

        System.out.println("Finally, they all went home with a " +
                adjective3 + " " + noun2 + ".");

        sc.close();
}
}