public class pair_of_an_array {
  
    public static void paires(int number[]){
          
        int tp = 0;
        
        for (int i = 0; i < number.length; i++) {
        
            int currnt = number [i];
        
            for (int j = i + 1 ; j < number.length; j++) {
        
                System.out.print("( " + currnt + " " + number[j] + ")");
        
                tp++;
            }
        
            System.out.println();
}
              System.out.println("total of the number " + tp);
}
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4,5,6,7,8,9,10};
        
        paires(numbers);
    
    }

}