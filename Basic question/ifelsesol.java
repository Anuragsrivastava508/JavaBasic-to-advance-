import java.util.*;
public class ifelsesol {

//Question1:WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative
    //    public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//             int n =sc.nextInt();
//          if (n > 0) {
//             System.out.println("enter  n grater than  0"+ n);
//          }   
//          else{
//             System.out.println("you have enter the number less thsn " + n);
//          }

//     }

// Question2:FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperatureis above 100 and otherwise prints You don't have a fever
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     double tem = sc.nextDouble();
//     if (tem >= 100) {
//         System.out.println("you have a fever " + tem);
//     } else {
//         System.out.println("you don't have a fever"+ tem);
//     }


// }

//WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the day in a week 1-7");
//      int week = sc.nextInt();
//     switch (week) {
//         case 1:
            
//                 System.out.println("monday");
//             break;
//          case 2:
//                 System.out.println("Tuesday");  
//             break;
//          case 3:
//             System.out.println("wednesday");
//             break;
//          case 4:
//             System.out.println("Thusday");
//             break;
//          case 5: 
//               System.out.println("Friday");
//               break;
//          case 6:
//             System.out.println("staurday");
//             break;
//          case 7:
//             System.out.println("sunday");
//             break;
    
//         default:
//             System.out.println("not a day");
//             break;
//     }
// }

// public static void main(String args[])
//  {
//     int a = 63,b = 36;
//     boolean x= (a<b)?true:false;
//     int y= (a>b)?a:b;
//     System.out.println(y);
// }
public static void main(String[] args) {
    

 Scanner sc = new Scanner(System.in);

 System.out.println("Input the year: ");
 
 int year = sc.nextInt();
 
 
 boolean x= (year%4) ==0; 
 boolean y= (year%100) !=0;
 boolean z= ((year%100==0) && (year%400==0));
 
 if(x && (y || z)) 
    {System.out.println(year+" is a leap year");

    }
    else
        {System.out.println(year+" is not a leapyear");

        }
}
}