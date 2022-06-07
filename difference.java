import java.util.Scanner;

public class difference {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int difference = (a*b - c*d);
        System.out.println("DIFERENÇA = " + difference);
        sc.close();
    }
}
