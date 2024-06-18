package Daily_lec.Day_4;
import java.util.*;
public class Longest_substring_Without_Repeating_Characcter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(lengthOfLongestSubstring(str));
    }
    static int lengthOfLongestSubstring(String st){
        int maxWindow = 0;
        int s = 0;
        int e = 0;
        int[] arr = new int[256];
        while (e < st.length()){
//            GROW
            int index = st.charAt(e);
            arr[index]++;

//            SHRINK
            while (arr[index] == 2){
                int r_index = st.charAt(s);
                arr[r_index]--;
                s++;
            }

//            TASK
            int curr = e - s + 1;
            maxWindow = Math.max(curr , maxWindow);
            e++;
        }
        return maxWindow;
    }
}
