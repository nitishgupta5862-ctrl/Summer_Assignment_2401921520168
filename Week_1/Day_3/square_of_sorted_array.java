class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums .length];
//         for(int i=0;i<nums.length;i++){
//             arr[i]=nums[i]*nums[i];
//         }
//         Arrays.sort(arr);
//         return arr;
//     }
// }
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        while(i<=j){
           int  left=nums[i]*nums[i];
            int right=nums[j]*nums[j];
            if(left>right){
               arr[k]=left;
                i++;}
            else{  
                arr[k]=right;
                j--;
            }
            k--;
        }
                return arr;
            }
        }
