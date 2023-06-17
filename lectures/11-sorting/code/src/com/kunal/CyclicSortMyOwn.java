package com.kunal;

import java.util.Arrays;

public class CyclicSortMyOwn {
    //check swap move Note this algorithm takes O(N) worst case it is linear time
    public static void main(String[] args){
        //this is what we want to have not stuff like {1,3,4,6} needs to be continuous
        int arr[] = {3,5,2,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        //this is the range from 1 to N only works for these types
        while(i< arr.length) {
            //checks to see if it's right or not
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                //this is the move on part
                i++;
            }
        }
    }
   static void swap(int[] arr,int first, int second){
        // swap then recheck
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
   }
}
