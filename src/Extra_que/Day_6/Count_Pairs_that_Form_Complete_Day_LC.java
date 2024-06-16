package Extra_que.Day_6;

import java.util.Scanner;

public class Count_Pairs_that_Form_Complete_Day_LC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int ans =countCompleteDayPairs(arr);
        System.out.println(ans);
    }
    public static int countCompleteDayPairs(int[] hours) {
        int count=0;
        for(int i=0;i<hours.length;i++){
            for(int j=i+1;j<hours.length;j++){
                int temp=hours[i]+hours[j];
                if(temp%24==0){
                    count++;
                }
            }
        }
        return count;

    }
}
