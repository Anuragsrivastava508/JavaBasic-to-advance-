public class subarray {

public static void Printing_subarray(int number[]){
    // int start =i;
    // int end = j;
int tp = 0 ;
    for (int i = 0; i < number.length; i++) {
        int start = i ;
        for (int j = i; j < number.length; j++) {
            int end = j ;
            for (int k = start; k <= end; k++) {
                System.out.print(number[k]+" ");
            }  
          tp++; 
        System.out.println();
        }

    }
    System.out.println("the toatal pair are" + tp);
}


    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        Printing_subarray(number);
    }
}