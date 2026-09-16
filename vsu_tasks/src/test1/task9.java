package test1;

    import java.util.Scanner;

    public class task9 {
        public static void main (String[] args){
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int k = scan.nextInt();

            System.out.println("Полных коробок: " + (n/k));
            System.out.println("Останется предметов: " + (n - (n/k)*k));
            System.out.println("Всего коробок нужно: " + ((n+k-1)/k));
        }
    }
