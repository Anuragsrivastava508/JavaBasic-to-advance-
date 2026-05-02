public class half_pyramid {
    public static void Inverted_half(int n){
        
        //outer loop 
for (int i = 1; i <= n; i++) {
    //inner loop 
    for(int j = 1 ; j<=(n-i+1); j++){
        System.out.print(j+ " ");
    }
    System.out.println();
}

    }

//     public static void pyramid(int I){
         
//     for (int i = 1; i <= I; i++) {

//         for(int j = 1; j<= i; j++){
// System.out.print(j + " ");
//         }
//         System.out.println();
//     }

//     }
    public static void main(String[] args) {
    Inverted_half(2);
    
    }
}
