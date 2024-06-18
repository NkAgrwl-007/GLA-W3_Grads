package Daily_lec.Day_5;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        factorial(n-1);
        return n*(n-1);
    }
}
