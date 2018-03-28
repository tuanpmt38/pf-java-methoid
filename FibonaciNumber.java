package methoid;

import java.util.Scanner;

public class FibonaciNumber {
    public static void main(String[] args) {
        for(int i=0; i<10;i++){
            System.out.println("Fibonaci(" + i + ") = " + findFibonaci(i));
        }

    }
    public  static  long findFibonaci (int n){
        if(n<3){
            return 1;
        }
        return findFibonaci(n-1)+ findFibonaci(n-2);
    }
}
