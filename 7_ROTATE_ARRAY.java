class Compute {
    
    public void rotate(long arr[], long n)
    {
        int n1=(int)n;
        int t=(int)arr[n1-1];
        for(int i=n1-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=t;
        
    }
}
