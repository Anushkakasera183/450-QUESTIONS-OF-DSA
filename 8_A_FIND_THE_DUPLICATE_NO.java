//THIS SOLUTION IS ONLY VALID IF THERE IS ONLY ONE DUPLICATE PAIR IN THE ARRAY .


class Solution {
    public int findDuplicate(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int n= nums.length-1;
        int actsum= (n*(n+1))/2;
        return sum-actsum;
        
    }
}
