import javax.management.StringValueExp;

import java.util.Arrays;

import static java.lang.Math.sqrt;

public class Assignment {
    //#1 TASK
    //n is length of an array
    public static int minimum(int [] a, int n) {
       if(n == 0){
           return a[n];
       }else return Math.min(a[n - 1], minimum(a, n - 1));
    }
    //#2 TASK
    //i starts from 0
    public static double average(int [] a, int n, int i) {
    if(i == n){
        return 0;

       }else return (double)a[i]/n +average(a, n, i+1);
    }
    //#3 TASK
    public static void isPrime(int n){
        int i = 2;
        if(isPrimeBoolean(n,i)){
            System.out.println("Prime");
        }else System.out.println("Composite");
    }
    //#4 TASK
    public static int factorial(int n){
        if(n < 2){
            return n;
        }

        return n*factorial(n-1);
    }
//#5 TASK
    public static int findElementFibonacci(int n){
        if(n<2){
            return n;
        }
        return findElementFibonacci(n-1)+findElementFibonacci(n-2);

    }
//#6 TASK
    public static int evaluatePower(int a, int n) {
        if(n == 1){
            return a;
        }else if(n == 0){
            return 1;
        }else if(n==2){
            return a*a;
        }
        return a*evaluatePower(a, n-1);
    }
    //#7 TASK
// the size is equal to given string length
    public static void permutationString(String s, int size){
        if(size == 0) {
            System.out.println(s);
            return;}
       for(int i=0; i<size; i++){
           permutationString(s, size-1);
           s = swapCharacters(s, i, size-1);


       }
    }
    //#8 TASK
    private static void isAllDigits(String s){
        if(isAllDigitsBoolean(s, 0)){
            System.out.println("YES");
        }else System.out.println("NO");
    }
    //#9 TASK
    public static int calculateCoefficient(int n, int k) {
        if(k==0||k==n){
            return 1;
        }else if(k == 1||k == n-1){
            return n;
        }
        return calculateCoefficient(n-1, k-1)+calculateCoefficient(n-1, k);
    }
    //#10 TASK
    public static int GCD(int a, int n) {
       if(n>a){
          int t = a;
          a = n;
           n= t;
       }
       int divisor = a/n;
       int remainder = a - n*divisor;
       if(remainder == 0){
           return n;
       }
       return GCD(n, remainder);
    }

    // ADDITIONAL USEFUL PRIVATE METHODS
    private static boolean isPrimeBoolean(int n,  int i ){

       if((n%i==0&&i<=sqrt(n))||n==1){

           return false;
       } else if(i>sqrt(n)){

           return true;
       }else return   isPrimeBoolean(n, i+1);
    }
    private static boolean isAllDigitsBoolean(String s, int i){
        if (i == s.length()) {
            return true;
        }
        if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
            return isAllDigitsBoolean(s, i+1);
        }else return false;
    }

    private static  String swapCharacters(String s, int index_1, int index_2 ){
        char [] charArray = s.toCharArray();
        char temp = charArray[index_1];
        charArray[index_1]= charArray[index_2];
        charArray[index_2]= temp;
        return String.copyValueOf(charArray);


    }


}
