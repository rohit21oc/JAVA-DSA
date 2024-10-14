public class CallByValue {
    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    public static void swap1(int num1,int num2){
        num1 =num1 ^ num2;
        num2 =num1 ^ num2;
        num1 =num1 ^ num2;
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
    public static void main(String[] args) {
        int a= 5;
        int b= 10;
        // swap(a,b);
        swap1(a, b);
        // System.out.println("a = "+a);
        // System.out.println("b = "+b);
    }
}
