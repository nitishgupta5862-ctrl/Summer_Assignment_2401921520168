class Solution {
    public int diagonalSum(int[][] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum +=arr[i][j];

                }
                else if(i+j==arr.length-1){
                    sum +=arr[i][j];
                }

            }
        }
        return sum;
    }
}
