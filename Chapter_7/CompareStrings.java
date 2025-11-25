import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String userName = kb.nextLine();

        String predefined = "Carmen";

        if (userName.equals(predefined)) {
            System.out.println(userName + " equals " + predefined);
        } else {
            System.out.println(userName + " does not equal " + predefined);
        }
    }
}
