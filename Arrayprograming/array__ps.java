import java.util.Scanner;

public class array__ps {
//   pring the input and increas the out put by 1

// public static void Printing_Input(){
//     Scanner SC = new Scanner(System.in);
//     int marks [] = new int[3];
//     System.out.println("enter your number");
// for (int i = 0; i < marks.length; i++) {
//     marks[i] = SC.nextInt();
//     marks[i] = marks[i] + 1;
// }
// System.out.println("the marks of phy :" + marks[0]);
// System.out.println("the marks of MATH :" + marks[1]);
// System.out.println("the marks of CHEM :" + marks[2]);

// }
// public static int Linear_Search(int num[], int key) {
//     for (int i = 0; i < num.length; i++) {
//         if (num[i] == key) {
//             return i;
//         }
//     }
//     return -1;
// }
  
public static void Largest_Number(int num[]){
    int samllest = Integer.MAX_VALUE;
    int Largest = Integer.MIN_VALUE;
    for (int i = 0; i < num.length; i++) {
        if (Largest < num[i]) {
            Largest = num[i];
        }
        if (samllest > num[i]) {
            samllest = num[i];
        }
    }
    System.out.println("the lagest value of a number is : " + Largest);
    System.out.println("the samllest value of a number is : " + samllest);
} 

    public static void main(String[] args) {
    //   Printing_Input();
    int num[] = {1,2,3,4,5,6,7,8,9};
    Largest_Number(num);
    // int key = 8;
    // int index = Linear_Search(num, key);
    // if (index == -1) {
    //     System.out.print("not found the key ");
    // }
    // else{
    //     System.out.println("found the key at index " + index);
    // }
    }
}
