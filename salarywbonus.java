import java.net.SocketTimeoutException;
import java.util.Scanner;

public class salarywbonus{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double fixedSalary = sc.nextDouble();
        double sold = sc.nextDouble();
        double bonus = (0.15*sold);
        double salaryWithBonus = (fixedSalary+bonus);
        System.out.printf("TOTAL = %.2f\n",salaryWithBonus);
        sc.close();
    }
}