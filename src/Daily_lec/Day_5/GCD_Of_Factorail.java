package Daily_lec.Day_5;
import java.util.*;
public class GCD_Of_Factorail {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int ans= gcd(fact(m), fact(n));
        System.out.println(ans);
    }
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
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
