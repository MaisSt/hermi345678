import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int chislo = scan.nextInt();
        int res = 1;

        for (int i = 1; i < chislo+1; i++) {
            res *= i;
        }

        System.out.println(res);

    }

}