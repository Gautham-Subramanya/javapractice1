import java.util.*;
public class palindrome {
    public static void main(String[] args) {
            int n, m, a = 0,x, sum=0,z;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter any number:");
            n = s.nextInt();
            m = n;
            z= n;
            while(n > 0)
            {
                x = n % 10;
                a = a * 10 + x;
                n = n / 10;
            }
            if(a == m)
            {
                while(z>0)
                {
                    x = z % 10;
                    z = z / 10;
                    if((x==2)||(x==4)||(x==6)||(x==8)){
                        sum = sum + x;
                    }
                }
                if( sum > 25){
                    System.out.println(m+" is palindrome and the sum of even numbers is greater than 25");
                }
                else{
                    System.out.println(m+" is a palindrome and the sum of even numbers is less than 25");
                }

            }
            else
            {
                System.out.println("Given number "+m+" is Not Palindrome");
            }
    }
}
