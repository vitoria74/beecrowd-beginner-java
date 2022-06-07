import java.util.Scanner;

public class simplecalculate {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int codeOne = sc.nextInt();
        int unitsOne = sc.nextInt();
        double pricePerUnitOne = sc.nextDouble();
        double valueToPayOne = (unitsOne*pricePerUnitOne);
        int codeTwo = sc.nextInt();
        int unitsTwo = sc.nextInt();
        double pricePerUnitTwo = sc.nextDouble();
        double valueToPayTwo = (unitsTwo*pricePerUnitTwo);
        double total = (valueToPayOne+valueToPayTwo);
        System.out.printf("VALOR A PAGAR = R$ %.2f\n",total);
        sc.close();
    }
}
