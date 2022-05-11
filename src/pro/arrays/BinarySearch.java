package pro.arrays;

import java.util.stream.IntStream;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4, 6, 7};
        int target = 2;
        int n = arr.length;
        System.out.println(n);
        //System.out.println("ele atndex=" + searchElement(arr, target, 0, n - 1));
        System.out.println(search(arr,target));
    }

    private static int searchElement(int[] arr, int target, int start, int n) {
        System.out.println("n=" + n);
        if (start <= n) {
            //middle element
            int m = start + (n - start) / 2;
            System.out.println("m=" + m);

            if (target == arr[m]) {
                return m;
            } else if (target < arr[m]) {
                return searchElement(arr, target, start, m-1);
            } else if (target > arr[m]) {
                return searchElement(arr, target, m+1, n);
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int l = 0, r=nums.length - 1;
        System.out.println("l=" + l);

      while(l<=r){
          int m=l+(r-l)/2;
          if(nums[m]==target){
              return m;
          }
          else if(nums[m]>target){
              r=m-1;
          }
          else{
              l=m+1;
          }
      }
        return -1;
    }
}
