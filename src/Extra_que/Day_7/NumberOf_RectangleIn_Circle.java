package Extra_que.Day_7;

import java.util.Scanner;

// GFG Link: https://www.geeksforgeeks.org/problems/rectangles-in-a-circle0457/1
public class NumberOf_RectangleIn_Circle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(rectanglesInCircle(n));
    }
    static int rectanglesInCircle(int r) {
        // code here
        int count=0;
        int diam= 4*r*r;
        for(int i=1;i<2*r;i++){
            for(int j=1;j<2*r;j++){
                if(i*i + j*j<= diam){
                    count++;
                }
            }
        }
        return count;
    }
}
