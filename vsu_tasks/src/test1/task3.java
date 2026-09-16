package test1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float r = scanner.nextFloat();

        double l = 2 * Math.PI * r;
        double s = Math.PI * r*r;

        String l_r = String.format("%.3f", l);
        String s_r = String.format("%.3f", s);

        System.out.println("Длина окружности с радиусом " + r + " равна " + l_r + ".");
        System.out.println("Площадь круга с радиусом " + r + " равна " + s_r + ".");




    }
}
