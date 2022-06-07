import java.util.Scanner;

public class consumption {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        double consumption = (x/y);
        System.out.printf("%.3f km/l%n",consumption);
        sc.close();
    }
}
