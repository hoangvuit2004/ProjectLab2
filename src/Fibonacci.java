public class Fibonacci {
    public static int getFibonacci(int n) {
        int a = n-1;
        if(a<=1){

            return a;
        }else{
            return getFibonacci(n-1) + getFibonacci(n-2);
        }

    }

    public static void main(String[] args) {
        System.out.println(getFibonacci(4));
        printFibonacci(10);
    }
    public static void printFibonacci(int n) {
        for (int i = 1; i <=n ; i++) {
            System.out.print(getFibonacci(i) + " ");
        }


    }
}
