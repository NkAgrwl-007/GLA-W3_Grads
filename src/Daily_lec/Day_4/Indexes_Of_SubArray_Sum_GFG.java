package Daily_lec.Day_4;
import java.util.*;
public class Indexes_Of_SubArray_Sum_GFG {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int s= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(subarraySum(arr,n,s));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here

        ArrayList<Integer> lst= new ArrayList<>();
        int sum=0;
        int j=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>s){
                sum-=arr[j++];
            }
            if(sum==s && j<=i){
                lst.add(j+1);
                lst.add(i+1);
                return lst;
            }

        }
        lst.add(-1);

        return lst;
    }
}
