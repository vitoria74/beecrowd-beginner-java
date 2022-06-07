import java.util.Scanner;

public class sphere{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();;
        double pi = 3.14159;
        double volumeSphere = (4.0/3)*pi*Math.pow(radius,3);
        System.out.printf("VOLUME = %.3f",volumeSphere);
        sc.close();
    }
}