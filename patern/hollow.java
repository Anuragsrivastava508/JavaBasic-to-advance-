public class hollow{

// // * * * * * *
// // *         *
// // *         *
// // * * * * * *

// public static void RectangleTohollow(int row,   int cols){
// for(int i = 1 ; i <= row; i++){
//     for(int j = 1 ; j <= cols; j++ ){

//         if (i==1 || i==row || j == 1 || j == cols){
//              System.out.print("*");
//         } else{
//              System.out.print(" ");
//         }
    
//     }
//     System.out.println();
// }
// }

//         *
//       * *
//     * * *
//   * * * *
// * * * * *

    // public static void Inverted_halfpyrmaid(int row ){
    //     for (int i = 1; i <= row; i++) {

    //         for (int j = 1; j <= (row - i); j++) {
    //             System.out.print(" ");
    //         }

    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }
    // }


// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15
// public static void Floyd_triangle(int n){
//     int counter = 1 ;
//     // outer loop
//     for(int i = 1; i<= n; i++){
//         for (int j = 1; j <= i; j++) {
//             System.out.print(counter+ " ");
//             counter++;
//         }
//         System.out.println();
//     }
// }


// 1
// 0 1
// 1 0 1
// 0 1 0 1
// // 1 0 1 0 1
// public static  void zero_one_triangle(int n){
//     // outer loop
//     for(int i = 1; i<= n; i++){
//         // inner loop
//         for (int j = 1; j <= i; j++) {
//             if ((i+j) % 2 == 0) {
//                 System.out.print("1");
//             } else {
//                 System.out.print("0");
//             }
//         }

//         System.err.println();
//     }
// }

// public static void  Butterfly(int n){
//     // outer loop
//     for (int i = 1; i <= n; i++) {
//         // inner loop 
        
//         // star
// for (int j = 1; j <= i; j++) {
//     System.out.print("*");
// }

//         //space
// for (int j = 1; j <=2*(n-i); j++) {
//     System.out.print(" ");

// }
//         // stars
//                 // star
// for (int j = 1; j <= i; j++) {
//     System.out.print("*");
// }
// System.out.println();

// }

//   // outer loop
//     for (int i = n; i >= 1; i--) {
//         // inner loop 
        
//         // star
// for (int j = 1; j <= i; j++) {
//     System.out.print("*");
// }

//         //space
// for (int j = 1; j <=2*(n-i); j++) {
//     System.out.print(" ");

// }
//         // stars
//                 // star
// for (int j = 1; j <= i; j++) {
//     System.out.print("*");
// }

// System.out.println();
// }
// }


// public static void Solidrhombus(int n){
//    // outer loop
// for (int i = 1; i <= n; i++) {
//     //spaces 
//     for (int j = 1; j <=( n - i); j++) {
//         System.out.print(" ");
//     }
//     //star 
//     for (int j = 1; j <= n; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }

// }
//  public static void  hollow_rhombus(int n){
// //outer loop
// for (int i = 1; i <= n; i++) {
// //inner loop 
// //spaces
// for (int j = 1; j <=(n - i); j++) {
//     System.out.print(" ");
// }
// // star
// for (int j = 1; j <= n; j++) {
//     if (i==1 || i== n || j == 1 || j == n){
//              System.out.print("*");
//         } else{
//              System.out.print(" ");
//         }
// }
// System.out.println();
// }

//  }


 public static void  Diamond(int n){
    for (int i = 1; i <= n; i++) {
        //inner loop 
        //spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        // stars 
        for (int j = 1; j <= 2* i - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // 2nd half
    for (int i = n; i >= 1 ; i--) {
          for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        // stars 
        for (int j = 1; j <= (2 * i) - 1; j++) {
            System.out.print("*");
        }
           System.out.println();
    }
    
 }
public static void main(String[] args) {
// RectangleTohollow(4,5);
// Inverted_halfpyrmaid(5);
// Floyd_triangle(5);    
// zero_one_triangle(5);
// Butterfly(4);
// Solidrhombus(5);
// hollow_rhombus(5);
// Diamond(4);
}


}