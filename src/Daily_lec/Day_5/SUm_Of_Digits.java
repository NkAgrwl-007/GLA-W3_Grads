package Daily_lec.Day_5;

public class SUm_Of_Digits {
    public static void main(String[] args) {
        System.out.println(sum(245));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10 + sum(n/10));
    }
}
