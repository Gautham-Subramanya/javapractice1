import java.util.*;

public class conditionalcheck {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number in the range 20 and 30");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if ((n > 20) && (n < 30)) {
            if (n % 2 == 0) {
                System.out.println("Jerry");
            } else {
                System.out.println("Tom");
            }
        } else {
            System.out.println("Not in the range");
        }
    }
}
