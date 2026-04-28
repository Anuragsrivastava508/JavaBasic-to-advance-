import java.util.*;
public class Greater {
public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
   
    if(a>b && b>c)
  {
 System.out.println("A is gratest and the number is"+ c);
     }
 else if (b < c && b < a){
    System.out.println("B is gratest and the number is " +b);
 }
 else
 {
    System.out.println("C is gratest and the number is  :" + c);
 }
}

}