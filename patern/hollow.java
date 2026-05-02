public class hollow{

public static void RectangleTohollow(int row,   int cols){

for(int i = 1 ; i <= row; i++){
    for(int j = 1 ; j <= cols; j++ ){

        if (i==1 || i==row || j == 1 || j == cols){
             System.out.print("*");
        } else{
             System.out.print(" ");
        }
    
    }
    System.out.println();
}

}


public static void main(String[] args) {
RectangleTohollow(4,5);
    
}


}