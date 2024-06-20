package Extra_que.Day_9;

import java.util.Scanner;

public class Power_Of_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n= sc.nextInt();
        System.out.println(isPowerofTwo(n));
    }
    public static boolean isPowerofTwo(long n) {

        // Your code here

        while(n>0){
            if(n==1 || n==2){
                return true;
            }
            else if(n%2==0){
                    n=n/2;
            }else{
                return false;}
        }
        return false;
    }
}
