import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Checkalpha { 
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("enter the character :" );
    

    char ch = sc.next().charAt(0);

    // if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u'
    //    || ch == 'A' || ch == 'I' || ch == 'O' || ch == 'E' || ch == 'U'
    //  ) {

    //     System.out.println(" They are vowell");

    // } else {

    //     System.out.println("the are is contrants");
    //  }

    switch (ch) {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':         
            System.out.println("they are vowell");
            break;
    
        default:
            System.out.println("Other are consttant");
            
    }
    
  }
}

