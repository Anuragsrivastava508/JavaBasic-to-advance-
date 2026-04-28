package patern;

public class JavaBascie {
  
public static void main(String[] args) {
int n = 4;

    // to print the pattern 
    // *
    // **
    // ***
    // ****
    // outer loop
    for(int i = 1; i <= 4; i++){
        // inner loop
        for (int j = 1; j <=i; j++) {
            System.out.print("*"+ " ");
        }
System.out.println();
  }
   // reverse printing
         // * * * * 
         // * * * 
         // * * 
         // * 

    for (int k = 1; k <= n ; k++) {
        for(int a = 1; a<=(n-k+1); a++){
            System.out.print("*" + " ");
        }
        System.out.println();
    }
}
}
