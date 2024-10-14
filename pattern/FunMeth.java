import java.util.*;
public class FunMeth {
    public static void helloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static int calculate(int num1,int num2){
        int sum = num1 +num2;
        return sum;
    }
    public static void main(String[] args) {
        // helloWorld();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = calculate(a,b);
        System.out.println(sum);
    }
}
