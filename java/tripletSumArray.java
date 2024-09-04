class tripletSumArray {
    
  
    static int maxTripletSum(int a[], int n)
    {
        // Complete the function
        int i = 0;
        int j = i+1;
        int k = j+1;
        int max = 0;
        while(i < n-2){
          int cs = a[i]+a[j]+a[k];
          if(k==n-1){
              j++;
              k = j+1;
              cs = a[i]+a[j]+a[k];
          }
          if(j == n-2){
              i++;
              j = i+1;
              k = j+1;
              cs = a[i]+a[j]+a[k];
          }
          max = Math.max(cs, max);
          k++;
          if(k == n){
              break;
          }
        }
        return max;
    }
  
    public static void main(String[] args) {
        int arr[] = {-25, -2, -6};
        int n = 3;
        int l = maxTripletSum(arr, n);
        System.out.println(l);
    }
}