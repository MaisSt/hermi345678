package test1;

import java.util.Scanner;


public class task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        int b = scanner.nextInt();
        char c = a.charAt(0);

        System.out.println("Привет, " + a + "!");
        System.out.println("Возраст — " + b + ", " + "первая буква имени — " + c + ".");
    }
}