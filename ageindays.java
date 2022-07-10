import java.util.Scanner;

public class ageindays {
   public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int inputDays = sc.nextInt();
    int years = (inputDays/365);
    int months = (inputDays % 365)/30;
    int days = (inputDays % 365) % 30;
    System.out.println(years + " ano(s)"); 
    System.out.println(months + " mes(es)"); 
    System.out.println(days + " dia(s)");
    sc.close();
   } 
}
