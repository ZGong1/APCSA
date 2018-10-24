import java.util.Scanner;

public class theprojectm8 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a grade.");
            int grade = k.nextInt();
            if (grade > 89)
                System.out.println("Your grade is an A.");
            else if (grade > 79)
                System.out.println("Your grade is a B.");
            else if (grade > 69)
                System.out.println("Your grade is a C.");
            else if (grade > 59)
                System.out.println("Your grade is a D.");
            else
                System.out.println("You have recieved a F, just like Eric on his computer science quiz this week");
        }
    }
}
