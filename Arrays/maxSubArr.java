package Arrays;

public class maxSubArr {
    public static void kadans(int number[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE; 
        for(int i=0;i<number.length;i++){
            curSum = curSum + number[i];
            if(curSum <0){
                curSum = 0;
            }
            maxSum = Math.max(curSum, maxSum);
        } 
        System.out.println("Out max sum of subArray is: "+maxSum);
      }
    public static void main(String[] args) {
        int number[] ={-1,2,-4,5,-6,8,-1,5,-2};
        kadans(number);
    }
}
