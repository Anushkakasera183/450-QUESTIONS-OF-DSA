
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> freq= new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            Integer j=freq.get(arr[i]);
            freq.put(arr[i],(j==null)?1:j+1);
        }
            int answer = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == k - arr[i])
            {
                answer += (freq.get(arr[i]) - 1);
            }
            else
            {
                Integer j = freq.get(k - arr[i]); 
                if(j!=null)
                    answer += j;
            }
        }
        answer /= 2;
          return answer;  
        }
    }
