class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int max=arr[n-1];
        int min=arr[0];
        int result=max-min;
        for(int i=1;i<n; i++){
            max=Math.max(arr[i-1]+k,arr[n-1]-k);
            min=Math.min(arr[0]+k,arr[i]-k);
            result=Math.min(result,max-min);
        }
        return result;
}}
