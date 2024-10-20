package AdvancePattern;

public class diamond {
    public static void diamondPattern(int n){
        // First half diamond
        for(int i=1;i<=n;i++){
            // Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // Star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Second half diamond
        for(int i=n;i>=1;i--){
            // Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // Star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondPattern(5);
    }
}
