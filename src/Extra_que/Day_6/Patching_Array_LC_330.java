package Extra_que.Day_6;

import java.util.Scanner;

public class Patching_Array_LC_330 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int m= sc.nextInt();
        int ans= minPatches(arr,m);
        System.out.println(ans);
    }
    public static int minPatches(int[] nums, int m) {
        int patch = 0;
        int count = 0;
        int idx = 0;
        while (patch < m) {
            if (idx < nums.length && patch + 1 >= nums[idx]) {
                patch += nums[idx];
                idx++;
            } else {
                patch += (patch + 1);
                count++;
            }
        }

        return count;
    }
}
