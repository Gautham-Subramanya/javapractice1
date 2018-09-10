import java.util.*;
public class reverse {
    public static void main(String[] args) {
        System.out.println("Enter a string to be reversed");
        Scanner scan = new Scanner(System.in);
        String s= scan.next();
        String reverse = "";
        for(int i= s.length()-1;i>=0;i--){
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);
    }
}
