package Codeorces.contest_1;
import java.util.*;

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        int max = 0;
        while(k>0){
            max = Math.max(max,k%10);
            k/=10;
        }
        int[] arr = new int[max];
        int[] ans = new int[max];
        int i=0;
        while(n>0){
            int r = n%10;
            arr[i] = r;
            n/=10;
            i++;
        }
        i = 0;
        while(i<max){
            ans[arr[i]-1] = i+1;
            i++;
        }
        int sum = 0;
        i=max-1;
        while(i>=0){
            sum = ans[i]+sum*10 ;
            i--;
        }
        System.out.println(sum);
    }
}
