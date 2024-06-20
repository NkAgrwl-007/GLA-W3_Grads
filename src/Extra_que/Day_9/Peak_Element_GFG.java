package Extra_que.Day_9;
import java.util.*;
// Que Link: https://www.geeksforgeeks.org/problems/peak-element/1?page=1&sortBy=submissions
public class Peak_Element_GFG {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n ;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(peakElement(arr,n));
    }
    public static int peakElement(int []arr, int n)
    {

        if (n == 1)
            return 0;

        for (int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                if (arr[i] >= arr[i + 1])
                    return i;
            }
            else if (i == n - 1)
            {
                if (arr[i] >= arr[i - 1])
                    return i;
            }
            else
            {
                if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                    return i;
            }
        }
        return -1;
    }
}
