public class BCDtoDCD {

    public static void BintoDec(int binNum){
 int pow = 0;
int mynum = binNum;
 int decNum = 0;
 while (binNum > 0) {
    
    int ld = binNum % 10;

    decNum = decNum + (int)(ld*Math.pow(2, pow));
     pow++;

    binNum = binNum / 10 ;

}

System.out.println("decimal of "+mynum+"=" +decNum);


    }
    
    public static void main(String[] args) {
        BintoDec(1010);
    }
}