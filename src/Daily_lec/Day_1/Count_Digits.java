package Daily_lec.Day_1;
import java.util.*;
public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        // BRUTE FORCE
//        int c = 0;
//        while(n > 0){
//            c++;
//            n /= 10;
//        }
//        System.out.println(c);

        // OPTIMAL SOLUTION
        int digits = (int) ( Math.log(n) / Math.log(10) ) + 1;
        System.out.println(digits);
    }
}
