public class Task1_1 {
    public static int getSn1(int n) {
        if (n == 1) {
            return 1;
        } else {
            int sum = getSn1(n - 1);
            return sum + ((n % 2 == 0) ? -n : n);
        }

    }
    public static int getSn2(int n) {

        if (n == 1) {
            return 1;
        } else {
            int sum = getSn2(n - 1);
            int temp = 1;
            for (int i = 2; i <=n ; i++) {
                temp*=i;
            }
            return sum+temp;
        }

    }
    public static int getSn3(int n) {

        if (n == 1) {
            return 1;
        } else {

            int sn3 = getSn3(n-1);
            int sum = n*n;

            return  sum + sn3;

        }


    }
    public static double getSn4(int n){
        if(n==0){
            return 1;
        }else{
            double temp = 1;
            double sum= getSn4(n-1);
            for (int i = 2; i <=n*2 ; i+=2) {
                temp*=i;
            }
            return sum+1/temp;
        }

    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(getSn1(n));
        System.out.println(getSn2(n));
        System.out.println(Math.pow(3,2));
        System.out.println(getSn4(3));
    }
}
