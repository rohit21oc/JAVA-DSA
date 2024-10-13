import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arr{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []arr = new int [5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(arr[1]);
        System.out.print("Enter array's values: ");
        // for(int i=0;i<arr.length;i++){
        //     arr[i] =in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        String [] str = new String[5];

        for(int i=0;i<str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // Modify
        str[2] = "Rohit";
        System.out.println(Arrays.toString(str));

    }
}