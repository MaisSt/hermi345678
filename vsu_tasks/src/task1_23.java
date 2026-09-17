import java.util.Scanner;



public class task23 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        float r = scaner.nextInt();
        float l = scaner.nextInt();
        float r_two = scaner.nextInt();
        if (r < r_two && r > l && l < r_two && r > 0 && l > 0 && r_two > 0) {
            double s1 = (3.14 * (Math.pow(r, 2))) / 8;
            double s2 = ((Math.pow(2 * r_two, 2))) - (3.14 * (Math.pow(r_two, 2))) / 2;
            System.out.println(s1 + s2);
        }else{
            System.out.println("Error not good danni");
        }
    }
}
