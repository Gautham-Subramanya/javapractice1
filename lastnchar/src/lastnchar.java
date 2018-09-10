import java.util.*;
public class lastnchar {
    public static void main(String[] args) {
        String s;
        String str,str1;
        int n, i;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the string");
        s = scan.next();
        int length= s.length();
        System.out.println("Enter an integer");
        n = scan.nextInt();
        System.out.println(s);
        str = s.substring(length-n, length);
        str1= s+str;
        for(i=1;i<n;i++){
            str1=str1+str;
        }
        System.out.println(str1);
    }
}
