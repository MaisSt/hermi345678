package test1;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        System.out.println("Сотни: " + a/100);
        System.out.println("Десятки: " + (a%100)/10);
        System.out.println("Единицы: " + a%10);
        System.out.println("Сумма цифр: " + ( (a/100) + ((a%100)/10) + (a%10) ));
    }
}
