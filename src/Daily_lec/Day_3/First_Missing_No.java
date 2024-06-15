package Daily_lec.Day_3;
import java.util.*;
public class First_Missing_No {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int ans= firstMissingPositive(arr);
        System.out.println(ans);
    }
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean ispresent = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] >= n + 1) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                ispresent = true;
            }
        }
        if (!ispresent) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            int idx = Math.abs(arr[i]) - 1;
            if (idx < n && arr[idx] > 0) {
                arr[idx] *= -1;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = i + 1;
                break;
            }
        }
        return ans == 0 ? n + 1 : ans;
    }
}
