package test1;



import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);

        int a = scaner.nextInt();
        int b = scaner.nextInt();
        System.out.println("Было: a = " + a + ", b = " + b );

        int c = b;
        b = a;
        a = c;
        System.out.println("Стало: a = " + a + ", b = " + b );
    }
}
