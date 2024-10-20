package Arrays;

public class SubArr {
    public static void SubArray(int number[]){
        int currSum = 0;
        int maxSum = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            int start =i;
            for(int j=i;j<number.length;j++){
                int end = j;
                currSum += 0;
                for(int k= start;k<=end; k++){
                    System.out.print(number[k]+" ");
                    // Print sub Array sum
                    currSum += number[k];
                }
                
                System.out.println("Min sum: "+currSum);
               
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                
            }
            System.out.println(); 
        }
        System.out.println("Max Sum: " +maxSum);
    }
    public static void main(String[] args) {
        int number[]= {2,4,6,8,10};
        SubArray(number);
    }
}
