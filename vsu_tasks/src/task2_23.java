package hermi345678.vsu_tasks.src;

import java.util.Scanner;



public class task2_23 {



    public static String days_2(int d, int m, int y){

        int cot = 0;
        if (m == 2){
            cot = 28;
        }else if (m == 4 || m == 6 || m == 9 || m == 11){
            cot = 30;
        }else{
            cot = 31;
        }

        if (d < cot) {

            if (m < 3) {
                m += 12;
                y -= 1;
            }

            int k = y % 100;
            int j = y / 100;

            int h = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

            if ((h + 6) % 7 > 5) {
                return "Выходной";
            } else {
                return "Рабочий день";
            }
        }else{
            return "ОШИБКА!!!";
        }
    }


    public static String days(int d, int m, int y) {

        if (m == 1) {
            if (d < 10) {
                return "Новогодние праздники";
            }
        } else if (m == 2) {
            if (d == 23) {
                return "День защитников Отечество";
            }
        } else if (m == 5) {
            if (d == 1) {
                return "День труда";
            }
        } else if (m == 3){
            if (d == 8){
                return "Международный женский день";
            }
        }

        return days_2(d, m, y);
    }



    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();

        if (month < 13 && day < 32 && month > 0 && day > 0){
            System.out.println(days(day, month, year));
        }else{
            System.out.println("ОШИБКА!!!");
        }
    }
}
