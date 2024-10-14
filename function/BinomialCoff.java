package function;
public class BinomialCoff {
    public static int factorial(int n){
        int f= 1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static int BinomCoff(int n,int r){
        int nf = factorial(n);
        int rf = factorial(r);
        int nf_nmrf = factorial(n-r);

        int binCoff = nf/(rf*nf_nmrf);
        return binCoff;
    }
    public static void main(String[] args) {
        // factorial(3);
        System.out.println(BinomCoff(5,2));
    }

}
