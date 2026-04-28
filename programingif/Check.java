import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the year : " );
        
        int year = sc.nextInt();

        boolean a = (year % 4) == 0;
        boolean b = (year % 100) !=0;
        boolean c = (year % 100== 0) && (year%400==0);
        if (a & b || c) {
            System.out.println("leaap year : "+year);
        
        } else {
        System.out.println("not aleeap year :"+year);    
        }
    }
}
