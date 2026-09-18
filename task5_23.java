import java.util.Scanner;

public class task5_23{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();

        for (int i = 0; i < h; i++){

            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < w-i; j++){
                System.out.print(j%10);
            }

            System.out.println();
        }
    }
}
