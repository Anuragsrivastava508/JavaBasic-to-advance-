public class DECtoBCD {
    
public static void decToBinary (int n)
{
int BinNum = 0;
int pow = 0 ;
 while(n > 0){
    int rem = n % 2;
    BinNum = BinNum + (rem *(int)Math.pow(10, pow));

    pow++;
    n = n / 2;
 }
 System.out.println("binary  of number is =" +BinNum);

} 


public static void main(String[] args) {
    decToBinary(5);
}


}

