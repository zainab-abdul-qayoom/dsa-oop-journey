package com.roadmap;

import java.util.Arrays;

public class ArraysOperation {
    static void main(String[] args) {
        int[] trav = {1, 2, 3, 4, 5,7 ,8, 9, 24, 78,13,5, 7,};
        traversal(trav);
        System.out.println();
        int[] insert = new int[6];
        insert[0] = 1;
        insert[1] = 2;
        insert[2] = 4;
        insert[3] = 5;
        insert[4] = 6;
        System.out.print(Arrays.toString(insertion(insert)));
        System.out.println();
        int[] delete = {1, 2, 3, 3, 4, 5, 6};
        System.out.println(Arrays.toString(deletion(delete)));
        int[] update = {1, 3, 3, 4, 5};
        System.out.println(Arrays.toString(updation(update)));
    }

    static void traversal(int[] trav){

        // time complexity = 0(n) and space complexity = 0(1)
        for (int i = 0; i < trav.length; i++) {
            System.out.print(trav[i] + " ");
        }
    }

    static int[] insertion(int[] arr) {
        // time complexity = 0(n) and space complexity = 0(1)
        int noOfElements = 5;
        int locationOfIndex = 2;
        if (noOfElements == arr.length) {
            System.out.println("Overflow!");
            return arr;
        } else {
            int i = noOfElements -1; // // Start from the last occupied element and shift it right.
            while (i >= locationOfIndex) {
                arr[i + 1] = arr[i];
                i--;
            }
        }
        arr[locationOfIndex] = 3;
        return arr;
    }

    static int[] deletion(int[] delete){
        // time complexity = 0(n) and space complexity = 0(1)
        int size = delete.length;
        int k = 3; // index of deletion
        int noOfElements = 7;
        if (size == 0){
            System.out.println("Underflow!");
        } else {
            for (int j = k; j < noOfElements -1; j++ ){
                delete[j] = delete[j + 1];
            }

        }
        delete[noOfElements -1] = 0; // instead of last elements overwrite it will write 0 at last index as the array size is fixed even after deleting
        return delete;
    }
    static int[] updation(int[] update){
        // time complexity = 0(1) and space complexity = 0(1)
        update[1] = 2;
        return update;
    }

}
