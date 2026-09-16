

package test1;

import java.util.Scanner;

public class task5 {
    public void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        String a_s = String.format("%10.2f", a);
        String b_s = String.format("%10.2f", b);
        String c_s = String.format("%10.2f", c);

        System.out.println(a_s + " " + b_s + " " + c_s);
        System.out.println(b_s + " " + c_s + " " + a_s);
        System.out.println(c_s + " " +  a_s + " " + b_s);
    }
}
