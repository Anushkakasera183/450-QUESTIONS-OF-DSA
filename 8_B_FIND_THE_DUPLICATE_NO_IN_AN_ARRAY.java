//THIS METHOD CAN BE USED WHEN THERE ARE MORE THAN ONE PAIR OF THE SAME DUPLICATE ELEMENT .



class Solution {
    public int findDuplicate(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            int t=Math.abs(nums[i]);
            if(nums[t-1]>0){
                nums[t-1]=nums[t-1]*-1;
            }
            else{
                num=nums[i];
                break;
            }
        }
        return Math.abs(num);
    }
}
