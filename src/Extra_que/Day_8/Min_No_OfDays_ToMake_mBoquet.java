package Extra_que.Day_8;

import java.util.Scanner;

public class Min_No_OfDays_ToMake_mBoquet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int []arr= new int[m];
        for(int i=0;i<m ;i++){
            arr[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        System.out.println(minDays(arr,m,k));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int s=0, e= (int)1e9;
        int ans= -1;

        while(s<=e){
            int mid= s+(e-s)/2;
            int cont=0, buk=0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<= mid){
                    cont++;
                    if(cont>=k){
                        buk++;
                        cont=0;
                    }
                }else{
                    cont=0;
                }
            }
            if(buk>=m){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
}
