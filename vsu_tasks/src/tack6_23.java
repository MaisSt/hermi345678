import java.util.Scanner;

public class tack6_23 {
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

                if (i == 0){
                    a = 1.0;
                }else{
                    a = a*x*(i+1.0) / i;
                }

                if (Math.abs(a) > e) {
                    sum_E += a;
                }

                if (Math.abs(a) > (e / 10)) {
                    sum_E10 += a;
                }
            }
            double func = 1 / (Math.pow((1-x), 2));

            System.out.println(sum_N + " сумма N");
            System.out.println(sum_E + " сумма первого условия е");
            System.out.println(sum_E10 + " сумма второго условия е");
            System.out.println(func + " функция");
        }else{
            System.out.println("X должно быть больше -1, но меньше 1!!!");
        }
    }
}
