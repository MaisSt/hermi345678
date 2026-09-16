package test1;

import java.util.Scanner;


public class task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int summ = a+b+c;

        System.out.println("Сумма чисел " + a + "," + b + " и " + c + " равна" +  " " + summ);
    }
}