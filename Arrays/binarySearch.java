package Arrays;

public class binarySearch {
    public static int binary(int number[],int key){
        int start = 0;int end = number.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            if(number[mid]== key){
                return mid;
            }if(number[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {10,12,14,16,18,20};
        int key = 12;
        System.out.println("Key index is on: "+binary(arr,key ));
    }
}
