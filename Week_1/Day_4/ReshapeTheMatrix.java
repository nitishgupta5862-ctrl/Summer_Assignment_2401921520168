class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat[0].length*mat.length!=r*c){
            return mat;
        }
        int n=mat[0].length;
        int ans[][]=new int[r][c];
        for(int i=0;i<r*c;i++){
            ans[i/c][i%c]=mat[i/n][i%n];
        }
        return ans;
    }
}
