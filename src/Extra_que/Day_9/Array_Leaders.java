package Extra_que.Day_9;
import java.util.*;
//Que Link: https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&sortBy=submissions
public class Array_Leaders {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n ;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(leaders(n,arr));
    }
    static ArrayList<Integer> leaders(int n, int []arr) {
        // Your code here
        // int i=0;
        ArrayList<Integer> lst= new ArrayList<>();
        for(int j=0;j<n;j++){
            for(int i=j+1;i<n;i++){
                if(arr[j]<arr[i]){
                    break;
                }
                if(i==(n-1)){
                    lst.add(arr[j]);
                }
            }


        }
        lst.add(arr[n-1]);
        return lst;
    }
}
