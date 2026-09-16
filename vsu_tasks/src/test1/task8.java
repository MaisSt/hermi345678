package test1;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        System.out.println("Рублей: " + a/100);
        System.out.println("Копеек: " + a%100);
    }
}