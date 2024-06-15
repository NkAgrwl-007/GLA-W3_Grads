package Codeorces.contest_1;
import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        ArrayList<Integer> lst= new ArrayList<>();
        duplicate(arr,lst);
        Collections.sort(lst);
        for(int i=0;i<lst.size();i++ ){
            System.out.print(lst.get(i)+" ");
        }
    }
    static void duplicate(int []arr, List<Integer> lst){
        int i=0;
        while(i<arr.length){
            int idx= Math.abs(arr[i])-1;
            if(arr[idx]>0){
                arr[idx]*= -1;
            }else{
                lst.add(Math.abs(arr[i]));
            }
            i++;
        }
    }
}
