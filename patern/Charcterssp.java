
 public class Charcterssp {

      // A 
      // B C 
      // D E F 
      // G H I J 
      // K L M N O 
      // P Q R S T U 
      // V W X Y Z [ \ 
      // ] ^ _ ` a b c d 
        public static void main(String[] args) {
        int k = 1;
        int n = 4;
       char ch ='A';

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
     System.out.print(ch + " ");
ch++;
    }
System.out.println();
}


        // // outerloop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                  k++;
            }
            System.out.println();
        } 
    }
}