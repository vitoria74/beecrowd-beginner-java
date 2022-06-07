import java.util.Scanner;

public class selectiontest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sumCD = (c+d);
        int sumAB = (a+b);
        if((b>c)&&(d>a)&&(sumCD>sumAB)&&(c>=0)&&(d>=0)&&(a%2==0)){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores não aceitos");
            sc.close();
        }
    }
}
