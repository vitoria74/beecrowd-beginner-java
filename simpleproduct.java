import java.util.Scanner;

public class simpleproduct {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = (a*b);
        System.out.println("PROD = "+prod);
        sc.close();
    }
}
