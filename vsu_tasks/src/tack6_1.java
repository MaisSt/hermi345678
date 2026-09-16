import java.util.Scanner;

public class tack6_1{
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);

        double x = scaner.nextDouble();
        int n = scaner.nextInt();
        double e = scaner.nextDouble();

        double a = 1.0;
        double sum_N = a;
        double sum_E = 0;
        double sum_E10 = 0;

        if (-1 < x && 1 > x){
            for (int i = 0; i < n; i++) {
                if (Math.abs(a) > e) {
                    sum_E += a;
                }

                if (Math.abs(a) > (e / 10)) {
                    sum_E10 += a;
                }


                int k = i + 1;
                a = a * ((2.0 * k - 1) / (2.0 * k)) * x * x;

                if (k < n) {
                    sum_N += a;
                }
            }
            double func = 1 / (Math.sqrt(1-x*x));

            System.out.println(sum_N);
            System.out.println(sum_E);
            System.out.println(sum_E10);
            System.out.println(func);
        }else{
            System.out.println("X должно быть больше -1, но меньше 1!!!");
        }
    }
}