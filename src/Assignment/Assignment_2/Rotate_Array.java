package Assignment.Assignment_2;

import java.util.*;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int d= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rotateArr(arr,d,n);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateArr(int arr[], int d, int n) {
        // add your code here
        d= d%n;
        reverse(arr, 0,n-1);
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-d-1);

    }
    static void reverse(int arr[],int p1,int p2){
        while(p1< p2){
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;p2--;
        }
    }
}
