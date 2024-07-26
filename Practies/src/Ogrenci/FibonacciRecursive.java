package Ogrenci;

public class FibonacciRecursive {
    public static void main(String[] args) {
        // 1,1,2,3,5,8,13
        System.out.println(fibonacci(7));
    }

   static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
