package Daily_lec.Day_2;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(5,10));
    }
    public static int gcd(int a, int b) {
        // code here
        while(a>0 && b>0){
            if(a>b) a= a%b;
            else b=b%a;

            if(a==0){
                return b;
            }
            if(b==0){
                return a;
            }
        }
        return 1;
    }
}
