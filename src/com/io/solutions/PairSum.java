package com.io.solutions;

/**
 * @author Shad Ahmad
 * Given an Array A of size n we need to find all the pairs in the array
 * that sum of equal to k variable
 * if no such pair exists then output will be -1
 * for ex:
 * arr[]={1,2,3,4,5,6,7}
 * sum=9
 * output:
 * pair(2,7)
 * pair(3,6)
 * pair(4,5)
 */
public class PairSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};//Here elements in sorted ordered we have

        int sum = 9;//This is out target pairs
        int low = 0;//it is initially from this our array size will start
        int high = arr.length - 1;//from here our array size will end

        while (low < high) {
            if (arr[low] + arr[high] > sum) {
                high--;
            } else if (arr[low] + arr[high] < sum) {
                low++;
            } else if (arr[low] + arr[high] == sum) {
                System.out.println("Pair " + (arr[low] + " + " + arr[high] + " "));
            }
        }
    }
}
