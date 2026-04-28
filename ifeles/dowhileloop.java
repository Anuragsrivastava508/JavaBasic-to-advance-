import java.util.Scanner;

public class dowhileloop {
//     public static void main(String[] args) {
//       for(int i = 1 ; i<=10;i++){
//         if (i == 5) {
//             continue;
//         }
//         System.out.println(i);
//       }
//         System.out.println("I am out from the loop");
//     }
// }

    // public static void main(String[] args) {
    //     Scanner sc =  new Scanner(System.in) ;
    //     do {
    //         System.out.print("enter the number ");
    //         int n = sc.nextInt();
    //         if (n % 10 == 0 ) {
    //           continue;                
    //         }
    //         System.out.println("number was :" + n );
    //     } while(true);
    // }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int sum = i * n;
            System.out.println(sum);
        }
    }

}
