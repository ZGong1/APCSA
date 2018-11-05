import java.util.Scanner;

public class chapter7 {
    public static void main(String[] args) {
        int ans = 1;
        System.out.println("Please enter an integer.");
        Scanner k = new Scanner(System.in);
        int num = k.nextInt();
        for (int i = num; i >= 1; i--) {
            ans *= i;
        }
        System.out.println("The factorial is " + ans);
    }
}