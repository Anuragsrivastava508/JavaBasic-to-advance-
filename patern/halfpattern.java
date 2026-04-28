 public class halfpattern {
public static void main(String[] args) {
    int n = 5;

    // 1 
    // 1 2 
    // 1 2 3 
    // 1 2 3 4 
    // 1 2 3 4 5 

    
//     for (int i = 1; i <= n; i++) {

//         for(int j = 1; j<= i; j++){
// System.out.print(j + " ");
//         }
//         System.out.println();
//     }


         // 1 2 3 4 5 
         // 1 2 3 4 
         // 1 2 3 
         // 1 2  
        // 1 


   for (int a = 1; a <= n; a++) {

        for(int j = 1; j<= (n - a + 1); j++){
System.out.print(j + " ");
        }
        System.out.println();
    }



}
    
}