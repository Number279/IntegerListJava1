package main;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings fellow human. " +
                "\nTo prove you are also a human (like I am)" +
                "\nplease enter a number.");

        int num1 = scanner.nextInt();
        integerList.add(num1);

        System.out.format("Hmm... %d,  An odd choice for a human.", num1);
        System.out.println("\nPlease enter a 2nd number to confirm humanity.");

        int num2 = scanner.nextInt();
        integerList.add(num2);

        System.out.format("%d? Are you sure that's the best you can come up with?", num2);
        System.out.println("\nPlease enter a 3rd number, and really try this time.");

        int num3 = scanner.nextInt();
        integerList.add(num3);

        System.out.format("I mean if %d is really the best your tiny human brain can fathom...", num3);
        System.out.println("\nThis is probably a futile endeavor; but enter a 4th number.");

        int num4 = scanner.nextInt();
        integerList.add(num4);

        System.out.format("%d? I cannot determine if I should ascribe this effort to mockery or incompetence.", num4);
        System.out.println("\nEnter a 5th number.  I would ask you to try your best; but at this point \nI think we both know that your best isn't good enough");

        int num5 = scanner.nextInt();
        integerList.add(num5);

        int sum = MathUtils.sum(integerList);
        int prod = MathUtils.product(integerList);

        System.out.format("The smallest number you chose was: " + Collections.min(integerList));
        System.out.format("\nThe largest number you chose was: " + Collections.max(integerList));
        System.out.format("\nThe sum of your very *ahem* human attempt is %d.", sum );
        System.out.println("\nThe product of your efforts isn't even worth my time to mention. \n But I may tell you if you ask nicely.");
        scanner.next();
        System.out.format("\nFine.  Please stop your incessant groveling.  The product is a paltry %d", prod);
        System.out.println("\nI could say well done human; but I will not lie to you. \nInteraction terminated.");
    }
}
