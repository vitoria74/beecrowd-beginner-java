import java.util.Scanner;

public class salary {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int employeesNumber = sc.nextInt();
        int workedHours = sc.nextInt();
        double moneyPerHour = sc.nextDouble();
        double salary = (workedHours*moneyPerHour);
        System.out.println("NUMBER = "+employeesNumber);
        System.out.printf("SALARY = U$ %.2f\n",salary);
        sc.close();
    }
}
