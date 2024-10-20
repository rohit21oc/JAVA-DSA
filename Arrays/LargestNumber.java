package Arrays;
import java.util.*;

public class LargestNumber{
    public static int FindNum(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smallest number is "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {15 , 25 ,35 , 45 ,99,65,464,4,645,654,45,4,6,64,64,5};
        System.out.println("Largest number is "+FindNum(arr));
    }
}
