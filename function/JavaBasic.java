
public class JavaBasic {
    
// printing hello world 10 time using function and methord 
// public static void printHelloworld(){
//     for(int i = 1;i<=10; i++){
// System.out.println("hello world "+ i);
//     }
// }

// sum of two number 
public static void sumofnum(int a, int b){

    int sum = a + b ;
    System.out.println("the sum od two number is :" +sum);

}

// Product of two number 
// public static void ProductofTwo(int a , int b){
//     int prod = a * b;
//     System.out.println("product of two number is " + " = " + prod);
//     // return prod ;
// }
public static void prodofnum(int a, int b){
     int mul =  a * b;
     System.out.println("the product of two number is =" + mul);
}


// print factorial of number of n 
public static int factorialOFnumber(int n ){
    int f = 1;
    for (int i = 1; i <= n; i++) {
       f = f * i;

    }
       return f ;
}

// combination  of   number !n/!r!(n-r) n C r
public static int   bincoff(int n , int r){
if (n < r) {
    return 0;
}
  
    int a = factorialOFnumber(n);

    int b = factorialOFnumber(r);
    int nmr = factorialOFnumber(n-r);
    int C = a /( b * nmr) ;
  
    return C;
}

// check the number is prime or not 

public static boolean IsPrime (int n) {
// Boolean isPrime = true ;
if (n == 2) {
    return true ;
}
for (int i = 2; i <= Math.sqrt(n); i++) {
    if (n % i == 0) {
       return  false; 
    }
}
return true;
} 


public static void primeInRange(int n) {
    for (int i = 2; i <= n; i++) {
        if (IsPrime(i)) {
            System.out.print(  i  + " ");
        }
    }
     System.out.println("");
} 


public static void main(String[] args) {

    int n = 15;

    System.out.println("factorial of two number is " + " = " + factorialOFnumber(n)); 

    System.out.println("prime  number is " + " = " + IsPrime(n)); 
 
    // printHelloworld();
 
    sumofnum(2, 98); 
 
prodofnum(5,6); 
 
    System.out.println("n C r of two number is " + " = " + bincoff(6, 4));
 
    primeInRange(n);
}

}
