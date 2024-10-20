package Arrays;

public class pairsOfArr {
    public static void pairs(int number[]){
        int curr, count=0;
        for(int i=0;i<number.length;i++){
            curr = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+ curr +","+ number[j] +")");
                count++;
            }
            System.out.println();
        }
        System.out.println("Totale count: "+ count);
    }
    
    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,7,8,5};
        pairs(numbers);
        
    }
}
