import java.util.*;
public class guess {
    public static void main(String[] args) {
        int number=77;
        System.out.println("Enter a number in the range 1 to 100");
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        if(n==number){
            System.out.println("Number guessed matches the original number");
        }
        else if(n<number){
            System.out.println("Number guessed is less than the original number");
        }
        else{
            System.out.println("Number guessed is more than the original number");
        }
    }
}
