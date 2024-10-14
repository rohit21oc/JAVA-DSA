public class InvertedStar{
    public static void main(String[] args) {
        // for(int line=5;line>=1;line--){
        //    for(int star =1;star<=line;star++){
        //     System.out.print("*");
        //    }
        //    System.out.println();
        // }

        int n=5;
        for(int line=1;line<=n;line++){
            for(int star =1;star<= n-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 