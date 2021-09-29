class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int max_sum=Integer.MIN_VALUE;
        int cur_sum=0;
        for(int i=0;i<n;i++){
            
            cur_sum=Math.max(cur_sum+arr[i],arr[i]);
            
            if (cur_sum>max_sum){
                max_sum=cur_sum;
                
            }
           
            
        }
        return max_sum;
        
