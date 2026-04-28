import java.util.Scanner;

public class javabasice {
  // //question 1
  //   public static void main(String[] args) {
  //    Scanner sc = new Scanner(System.in);
  //    System.out.println("enter the number:");
  //    int n =sc.nextInt();       
  //     if (n > 0) {
  //       System.out.println(" the number you have enter is postive :"+n);
  //     }  
  //      else if (n<0) {
  //       System.out.println("the number you have entered is negative:"+n);
  //     }
  //     else{
  //       System.out.println("you have entered the number zero:"+n);
  //     }
  //   sc.close();
  //      }


 // question 2 even or odd
// public static void main(String[] args) {
// Scanner sc =new Scanner(System.in);
// System.out.println("Enter the number:");
// int a = sc.nextInt();
// if (a==0) {
// System.out.println("you have enter the number : "+a);
// } 
// else if (a % 2 == 0) {
//     System.out.println("you have enter the even number :"+a);
//   }
//   else {
//   System.out.println("you have enter the odd number :"+a);
// }
// sc.close();
// }



// // question 3 gratest of two 
// public static void main(String[] args) {
//   Scanner sc =new Scanner(System.in);
//   System.out.println("enter the number a:");
//   int a =sc.nextInt();
// System.out.println("enter the number b :");
//   int b = sc.nextInt();
//   System.out.println("enterd the number c:");
//   int c = sc.nextInt();
//   if (a > b && a > c ) {
//      System.out.println("a is greater than b: " + a);
//   }
//   else if (a > b && b > c) {
//          System.out.println("b is greater than a: " + b);
//   }
//   else if (c > a && c > b) {
//     System.out.println("c is greater than b :"+c);
//   }
//   else{
// System.out.println("the number you have entered is equal (a == b == c) ");
//   }
// }


// // queston 4 leap  yar or not 
// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   System.out.println("enter the year :");
//    int year = sc.nextInt();
//    if (  year % 400 == 0|| year % 4 == 0 && year % 100 != 0) {
//     System.out.println("it is leap "+year);
//    }
//    else{
//     System.out.println("not a leep year :"+year);
//    }
// }




// //6.	Check whether a character is a vowel or consonant
// public static void main(String[] args) 
//   Scanner sc= new Scanner(System.in);
// System.out.println("enter the charcter to check the vowel or consonant");
// char ch = sc.next().charAt(0); 
// if ((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')) {
//   if (ch == 'a'||ch=='e'||ch =='i'||ch =='o'||ch == 'u'||
//   ch == 'A' || ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'
// ) {
//     System.out.println("you have enter the vowel :" + ch);
//   } else {
//     System.out.println("and other are  consonant :"+ch);
//   }
// } else {
//   System.out.println("not an alphabet:");
// }
// }



// //7.	Check whether a person is eligible to vote
// public static void main(String[] args) {
//   Scanner sc =new Scanner(System.in);
//   System.out.println("enter the number to check to vote or not ");
//   int a =sc.nextInt();
//   if (a>=18) {
//     System.out.println("you can vote :"+a);
//   }
//   else{
//     System.out.println("you can not vote "+a);
//   }
// }




// // 8.	Check whether a number is divisible by 5 and 11
// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   System.out.println("enter the number : ");
//   int a = sc.nextInt();
//   if (a % 5 == 0 && a % 11 == 0) {
//     System.out.println("The number is divisible by 5 and 11:"+a);
//   } else {
//     System.out.println("The number is not  divisible by 5 and 11 :"+a);
//   }
// }


// //9.	Check whether a number is multiple of 3 or 7
// public static void main(String[] args) {
//   Scanner sc =new Scanner(System.in);
//   System.out.println("enter the number to check the multiple of 3 or 7");
//   int b = sc.nextInt();
// if (b % 3 == 0 || b % 7 == 0) {
//   System.out.println("it is  a multiple of 3 or 7 :"+b);
// }
// else{
//   System.out.println("it is not a multiple of 3 0r 7 :"+b);
// }
// }

//10.	Check whether a character is uppercase, lowercase, digit, or special symbol
// public static void main(String[] args) {
//   Scanner sc =new Scanner(System.in);
//   System.out.println("enter the character is uppercase, lowercase, digit, or special symbol ");
// char a = sc.next().charAt(0);
//   if (a >= 'A' && a<='Z') {
//     System.out.println("you have enter the uppercase :"+a);
//   }
//   else if(a >= 'a' && a<='z') {
// System.out.println("you have enter the lowercase :"+a);
//   }
//  else if(a >= '0' && a<='9'){
//   System.out.println("you have enter the digit :"+a);
//  }
//  else {
//   System.out.println("it is a apical character "+a);
//  }
// }


// print reverse of a number 
public static void main(String[] args) {
int n = 6062003 ;
int reverse  = 0;
  while (n > 0) {
  //   int num  = n % 10 ; 
  // System.out.print(num +"");
  //   n = n / 10;
  int lsatdigit = n % 10;

   reverse = reverse * 10  + lsatdigit;

  n = n / 10;
 
  }
   System.out.print(reverse);
  }
 }