package Extra_que.Day_6;
import java.util.*;
public class Count_Pairs_II {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        long ans =countCompleteDayPairs(arr);
        System.out.println(ans);
    }
    public static long countCompleteDayPairs(int[] hours) {
        long count=0;
        int mod=24;
        Map<Integer, Integer> a= new HashMap<>();

        for(int hour : hours){
            int r= hour % mod;
            int c= (mod-r)% mod;

            if(a.containsKey(c)){
                count+= a.get(c);
            }
            a.put(r,a.getOrDefault(r,0)+1);
        }
        return count;

    }
}
