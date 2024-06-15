package Daily_lec.Day_3;
import java.util.*;
public class Insertion_sort {
    public static void main(String[] args) {
        int []arr= {1,2,3,6,8,7,5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int p=i;
            while(arr[p]< arr[p-1]){
                swap(arr, p, p-1);
                p--;
            }
        }
    }
    static void swap(int []arr, int p1, int p2){
        int temp= arr[p1];
        arr[p1]=arr[p2];
        arr[p2]=temp;

    }
}
