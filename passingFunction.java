import java.util.Arrays;

public class passingFunction {
    public static void main(String[] args) {
        int []nums = {2,3,5,8,11};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void change(int[] arr){
        arr[3]=7;
    }
}
