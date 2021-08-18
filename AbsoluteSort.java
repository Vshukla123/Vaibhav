import java.util.*;
import java.lang.*;
import java.io.*;


/*

Problem Statement 1 : You are given a sorted array containing both negative and positive
values. Resort the array taking absolute value of negative numbers.
Ex. A = {-7,-5,-3,-1,3,6,9}
Output: {-1,-3,3,-5,6,-7,9}

 */
public class AbsoluteSort {
    public static void main(String[] args) {
        int arr[] = new int[]{-7, -7, 7, -1, 3, 6, 9}; //{ -1, -3, 3, -5, 6, -7, 9}
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i])>Math.abs(arr[j])) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        Arrays.stream(arr).forEach(System.out::print);
    }

}


