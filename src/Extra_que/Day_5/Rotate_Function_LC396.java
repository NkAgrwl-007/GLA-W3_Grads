package Extra_que.Day_5;
import java.util.*;

public class Rotate_Function_LC396 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int ans=maxRotateFunction(arr);
        System.out.println(ans);
    }
        public static int maxRotateFunction(int[] nums) {
            int n = nums.length;
            int sum = 0, F = 0;

            for (int i = 0; i < n; i++) {
                sum += nums[i];
                F += i * nums[i];
            }

            int max = F;

            for (int k = 1; k < n; k++) {
                F = F + sum - n * nums[n - k];
                max = Math.max(max, F);
            }

            return max;
        }
    }
