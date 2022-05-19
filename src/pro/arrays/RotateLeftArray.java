package pro.arrays;

import java.util.Arrays;

public class RotateLeftArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    //int[] arr={1,2,3,4,5}
    //int[] arr={4,5,3,1,2}
    //int[] arr={4,5,1,2,3}
    static void rotateArray(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            int temp = 0;
            temp = arr[0];
            bitShift(arr, temp);
        }
    }

    private static void bitShift(int[] arr, int temp) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

}

