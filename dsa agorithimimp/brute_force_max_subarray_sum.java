public class brute_force_max_subarray_sum {
    // brute_force 3 (means order of n3 )
public  static  void  maxsubarry_sum(int number[]){
    int cuurent;
    int maxsum =Integer.MIN_VALUE;
    for (int i = 0; i < number.length; i++) {
        int start = i ;     
        for (int j = i; j < number.length; j++) {
            int end = j;
            cuurent = 0;
            for (int k = start; k <= end; k++) {
                cuurent += number[k];
            }
            System.out.println(cuurent);
            if (maxsum < cuurent) {
                maxsum = cuurent;
            } 
        }
    }
    System.out.println("max sum is equal to  " + maxsum);
}

      // brute_force 2 (means order of n2 )

        // brute_force 1 (means order of n )
    
    public static void main(String[] args) {
        int number[] ={1,-2,6,-1,3}; 
        maxsubarry_sum(number);
    
    }
}
