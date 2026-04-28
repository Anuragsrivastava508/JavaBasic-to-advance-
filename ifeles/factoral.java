import java.util.Scanner;

public class factoral {

    public static void main(String[] args) {
        int fact = 1 ;
        int num  ;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number :");
      num =sc.nextInt();
       for (int i = 1; i <= num; i++) {
             fact *=i; 
        }
             System.out.println("factorial of a number is : " + fact);

    }


 //question one  ki ye kith=ne bar print kare ga
// public static void main(String[]args)
// {
//     for(int i=0;i<5;i++)
//      {
//         System.out.println("Hello"); 
//          i+=2;
//     }
// }

}