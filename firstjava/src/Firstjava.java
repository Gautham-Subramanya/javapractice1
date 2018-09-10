import java.sql.SQLOutput;

public class Firstjava {
    public static void main(String[] args){
        System.out.println("Hello World");
        int a=30;
        float b = (float)20;
        double c=65.23;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        if(a<b){
            System.out.println("A is smaller");
        }
        else{
            if(a==b){
                System.out.println("A is equal to b");
            }
            else{
                System.out.println("B is smaller");
            }
        }
        switch(a){
            case 0:
                System.out.println("0 is here");
                break;
            case 10:
                System.out.println("10 is here");
                break;
            case 20:
                System.out.println("20 is here");
                break;
            default:
                System.out.println("none");
        }
        System.out.printf("Rctangle area is "+ area(5,10));
        System.out.println("Rectangle perimeter is"+ perimeter(5,10));
    }
    public static int area(int length, int width){
        int area= length*width;
        return area;
    }

    public static int perimeter(int length, int width){
        int perimeter= 2*(length+width);
        return perimeter;
    }
}
