class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m=nums.length, n= nums[0].length;
        if(r*c!=m*n) return nums;
        int[][] res=new int[r][c];
        for(int i=0;i<r*c;i++){
            res[i/c][i%c]=nums[i/n][i%n];
        }
        return res;
    }
}
