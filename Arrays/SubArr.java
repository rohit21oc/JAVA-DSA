package Arrays;

public class SubArr {
    public static void SubArray(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix [] = new int[number.length];
        prefix[0]=number[0];
        // prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+prefix[i];
        }


        for(int i=0;i<number.length;i++){
            int start =i;
            for(int j=i;j<number.length;j++){
                int end = j;
                currSum = start == 0?  prefix[end]: prefix[end]- prefix[start-1];

                // for(int k= start;k<=end; k++){
                //     System.out.print(number[k]+" ");
                //     // Print sub Array sum
                //     currSum += number[k];
                // }
                
                // System.out.println("Min sum: "+currSum);
               
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                
            }
            System.out.println(); 
        }
        System.out.println("Max Sum: " +maxSum);
    }
    public static void main(String[] args) {
        // int number[]= {2,4,6,8,10};
        int number[]= {2,-4,1,3,-5};
        SubArray(number);
    }
}
