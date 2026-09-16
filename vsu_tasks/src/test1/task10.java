package test1;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int sum_date = scan.nextInt();
        System.out.println("Следующий день: " + ((sum_date%7)+1));

    }
}
