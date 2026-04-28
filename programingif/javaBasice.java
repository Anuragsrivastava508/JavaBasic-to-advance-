
// 1.	Check whether a number is positive, negative, or zero
import java.util.*;

public class javaBasice {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

       if(a>0){
        System.out.println("you have enter the number postive"+ a );
       }
        else if (a<0)
        {
            System.out.println("you have enter the negaive number "+ a);
        }
else
{
    System.out.println("the number you have enter is not postive nor not negative it is a zero"+a);
}

    }
}


