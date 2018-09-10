import java.util.*;
import java.lang.*;
public class vowelconsonant {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        s = in.nextLine();
        int i=0;
        while(s.charAt(i)!='\0'){
            char c = s.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||
                        s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                    System.out.println("Vowel");
                }
                else{
                    System.out.println("Consonant");
                }
            }
            else{
                System.out.println("Not a alphabet");
            }
            i++;
        }
    }
}
