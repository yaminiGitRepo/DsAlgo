package pro.arrays;

public class GetCountOfNegNumin {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[][] grid1 = {{5,1,0},{-5,-5,-5}};
        System.out.println("countNegatives="+countNegatives(grid));

    }
    public static int countNegatives(int[][] grid) {
        int count=0,index=0;
        int n=grid.length;
        for (int i=n-1;i>=0;i--){
            System.out.println("count="+count);
            System.out.println("grid="+grid[i]);
            index= lastNegNum(grid[i],index,grid[i].length-1);
            count =count+(grid[i].length-index);
        }
        return count;
    }


    private static int lastNegNum(int[] grid, int l, int h){
        while(l<=h){
            int m= l+(h-l)/2;
            if(grid[m]<0){
                h=m-1;
            }else{
                l=m+1;
            }
            System.out.println("l="+l);
        }
        return l;
    }
}
