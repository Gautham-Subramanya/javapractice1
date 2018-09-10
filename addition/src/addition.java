import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        System.out.println("Enter the numbers to be added - ");
        Scanner input = new Scanner(System.in);
        String in;
        in = input.nextLine();
        int length;
        int sum = 0;
        length = in.length();
        String strarr[] = in.split(" ");
        int intarr[] = new int[strarr.length];
        for (int count = 0; count < intarr.length; count++) {
            intarr[count] = Integer.parseInt(strarr[count]);
        }
        for (int count = 0; count < intarr.length; count++) {
            sum = sum + intarr[count];
        }
        System.out.println(sum);
    }
}

