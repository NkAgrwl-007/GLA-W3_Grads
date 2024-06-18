package Daily_lec.Day_5;

public class power {
    public static void main(String[] args) {
        System.out.println(exponential(5,25));
    }
    static int exponential(int x , int n){
        if(n==0) return 1;
        int half= exponential(x,n/2);
        int full= half*half;
        if(n%2==0) return full;
        return x*full;
    }
}
