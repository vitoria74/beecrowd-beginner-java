import java.util.Scanner;

public class bhaskara {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = Math.pow(b,2) - (4*a*c);
        double rootOne = (-(b)+Math.sqrt(delta))/(2*a);
        double rootTwo = (-(b)-Math.sqrt(delta))/(2*a);
        if((a==0)||(0>b)||(0>delta)){
            System.out.println("Impossível de calcular");
        }
        System.out.println(String.format("R1 = %.5f",rootOne));
        System.out.println(String.format("R2 = %.5f",rootTwo));
        sc.close();
    }
}
