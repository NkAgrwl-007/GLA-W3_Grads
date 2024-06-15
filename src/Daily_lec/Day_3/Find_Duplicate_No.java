package Daily_lec.Day_3;
import java.util.*;
public class Find_Duplicate_No {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=findDuplicate(arr);
        System.out.println(ans);
    }
    public static int findDuplicate(int[] arr) {
        int i = 0;
        int dup = -1;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int temp = arr[i];
                if (arr[temp - 1] != temp) {
                    arr[i] = arr[temp - 1];
                    arr[temp - 1] = temp;
                } else {
                    dup = temp;
                    break;
                }
            } else {
                i++;
            }
        }
        return dup;
    }
}
