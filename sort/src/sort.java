import java.util.*;
public class sort {
    public static void main(String[] args) {
        int number, n, sum=0;
        int sorted = 0;
        int digits = 10;
        int sortedDigits = 1;
        boolean first = true;
        System.out.println("Enter an integer");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        while (number > 0) {
            int digit = number % 10;

            if (!first) {

                int tmp = sorted;
                int toDivide = 1;
                for (int i = 0; i < sortedDigits; i++) {
                    int tmpDigit = tmp % 10;
                    if (digit >= tmpDigit) {
                        sorted = sorted/toDivide*toDivide*10 + digit*toDivide + sorted % toDivide;
                        break;
                    } else if (i == sortedDigits-1) {
                        sorted = digit * digits + sorted;
                    }
                    tmp /= 10;
                    toDivide *= 10;
                }
                digits *= 10;
                sortedDigits += 1;
            } else {
                sorted = digit;
            }

            first = false;
            number = number / 10;
        }
        System.out.println(sorted);
        while(sorted>0){
            n=sorted%10;
            sorted=sorted/10;
            if(n%2==0){
                sum=sum+n;
            }
            else{
                sum=sum+0;
            }
        }
        if(sum>15){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

