import java.util.Scanner;

public class area{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double pi = 3.14159;
        double areaTriangle = (a*c)/2;
        double areaCircle = pi*Math.pow(c,2);
        double areaTrapezium = (a+b)*c/2;
        double areaSquare = (b*b);
        double areaRectangle = (a*b);
        System.out.println(String.format("TRIANGULO = %.3f",areaTriangle));
        System.out.println(String.format("CIRCULO = %.3f",areaCircle));
        System.out.println(String.format("TRAPEZIO = %.3f",areaTrapezium));
        System.out.println(String.format("QUADRADO = %.3f",areaSquare));
        System.out.println(String.format("RETANGULO = %.3f",areaRectangle));
        sc.close();
    }
}