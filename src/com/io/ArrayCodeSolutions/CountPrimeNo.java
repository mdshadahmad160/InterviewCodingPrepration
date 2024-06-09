package com.io.ArrayCodeSolutions;

import java.util.Scanner;

public class CountPrimeNo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Array: ");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter: " + size + " Values: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int count=countPrimeNo(arr);
        System.out.println("Prime Number: " + count);
    }

    private static int countPrimeNo(int[] array) {
        int count=0;
        for (int i=0;i<array.length;i++){
             boolean isPrime=false;
            for (int j = 2; j<=array[i]/2; j++){
                 if (array[i]%j==0){
                     isPrime=true;
                 }
             }
             if (isPrime==false){
                 count++;
             }
        }
        return count;
    }

}
