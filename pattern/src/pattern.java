import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n,i,j;
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
        }
    }
}
