public class largest_number {
    public static void largestnumber(int number []){
int LARGEST = Integer.MIN_VALUE;
int SMALLEST = Integer.MAX_VALUE;
for (int i = 0; i < number.length; i++) {
    if (LARGEST<number[i]) {
        LARGEST = number[i];
    }
    if (SMALLEST > number[i]) {
        SMALLEST = number[i];
      
    }
   
}
   System.out.println("Largest number is :" + LARGEST);
        System.out.println("Smallest number is :" + SMALLEST); 
    } 
    public static void main(String[] args) {
        int number[] ={3,5,7,9,4,6,10};
        largestnumber(number);
    }
}
