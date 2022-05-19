package pro.arrays;

public class SearchElementRotatedArray {

    public static void main(String[] args) {
        int [] arr={5, 6, 7, 8, 9, 10, 1, 2, 3};
        int k=3;
        System.out.println("ele="+searchElement(arr,k));

    }
    private static int searchElement(int[]arr,int k){
        int n= arr.length-1;
        int p=findPivot(arr,n);

        System.out.println("p="+p);
            if(k==arr[p]){
            return p;
        }
        if(arr[0]<=k)
            return binarySerach(arr,0,p-1,k);
         return binarySerach(arr,p+1,n,k);
    }

    private static int binarySerach(int[] arr, int l, int h, int k) {
        if(l<=h){
            int m=l+(h-l)/2;

            if(k==arr[m]){
                return m;
            }else if(k<arr[m]){
               return binarySerach(arr,l,m-1,k);
            }else{
                return binarySerach(arr,m+1,h,k);
            }
        }
        return -1;
    }


    private static int findPivot(int[] arr,int n) {
        int l=0;
        int p=-1;
      while(l<n){
          if(arr[l]>arr[l+1]){
           return l+1;
          }else{
              l++;
          }
      }
      return -1;
    }
}
