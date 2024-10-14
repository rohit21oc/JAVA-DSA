import java.util.Scanner;
public class Product {
    public static int multiply(int a,int b){
        int multiply = a*b;
        return multiply;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println( "Enter two number: ");
        int a= in.nextInt();
        int b=in.nextInt();
        int multiply = multiply(a, b);
        System.out.println("a * b = "+multiply);
    }
}
