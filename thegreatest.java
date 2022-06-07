import java.util.Scanner;

public class thegreatest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int greatestAB = (a+b+Math.abs(a-b))/2;
        int greatestABC = (greatestAB + c + Math.abs(greatestAB-c))/2;
        System.out.println(greatestABC+" eh o maior");
        sc.close();
    }
}
