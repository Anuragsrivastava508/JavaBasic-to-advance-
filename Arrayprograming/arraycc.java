import java.util.Scanner;
public class arraycc {
    public static void main(String[] args) {
        int marks [] = new int[20];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
         marks[1] = sc.nextInt();
          marks[2] = sc.nextInt();

        System.out.println("math marks is : "+ marks[0]);
        System.out.println("eng marks is : "+ marks[1]);
        System.out.println("sci marks is : "+ marks[2]);

        int sum =( marks[0] + marks[1] + marks[2] )/ 3;
        System.out.print("the sum of three number is " + sum);
    }
}
