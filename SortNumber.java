package methoid;

import java.util.Scanner;

public class SortNumber {
    public static void main(String[] args) {
        int [] number= {6,7,3};
        sortNumber(number);
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        display(number);
    }
    public static void display(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void  sortNumber (int a[]){
        int temp ;
        for(int i=0;i<a.length;i++){
            for(int j=a.length-1;j>=i;j--){
                if(a[i]>a[j]){
                     temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

    }
}
