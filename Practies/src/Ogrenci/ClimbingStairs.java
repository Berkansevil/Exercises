package Ogrenci;

public class ClimbingStairs {
    public static void main(String[] args) {
    ClimbingStairs climbingStairs=new ClimbingStairs();

        System.out.println( climbingStairs.climbStairs(3));

    }
    public int climbStairs(int n){
        if(n==0 || n==1){
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }

}
