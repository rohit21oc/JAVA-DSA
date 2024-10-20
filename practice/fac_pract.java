public class fac_pract {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binCoff(int n,int r){
        int f_n = factorial(n);
        int f_r = factorial(r);
        int f_nmr = factorial(n-r);
        int bicoff = f_n / (f_r * f_nmr);
        return bicoff;
    }
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(binCoff(5, 2));
    }
}
