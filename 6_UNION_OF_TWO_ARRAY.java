class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {   int c=0;
        HashSet<Integer> hm= new HashSet<Integer>();
        for(int i=0;i<n; i++){
            
                hm.add(a[i]);
                c++;
            
        }
        for(int i=0;i<m; i++){
            hm.add(b[i]);
            c++;
            }
        
        return hm.size();
    }
}
