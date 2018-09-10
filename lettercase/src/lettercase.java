import java.util.*;
public class lettercase {
    public static void main(String[] args) {
        System.out.println("Enter a letter");
        Scanner scan= new Scanner(System.in);
        char a= scan.next().charAt(0);
        if(((a>='a')&&(a<='z'))||(a>='A')&&(a<='Z')){
            if((a>='a')&&(a<='z')){
                System.out.println("Small Letter");
            }
            else{
                System.out.println("Capital Letter");
            }
        }
        else{
            System.out.println("Not a letter");
        }
    }
}
