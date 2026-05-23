import java.util.Scanner;

public class array__ps {
//   pring the input and increas the out put by 1

public static void Printing_Input(){
    Scanner SC = new Scanner(System.in);
    int marks [] = new int[3];
for (int i = 0; i < marks.length; i++) {
    marks[i] = SC.nextInt();
    marks[i] = marks[i] + 1;
}
System.out.println("the marks of phy :" + marks[0]);
System.out.println("the marks of MATH :" + marks[1]);
System.out.println("the marks of CHEM :" + marks[2]);

}
  


    public static void main(String[] args) {
      Printing_Input();
    }
}
