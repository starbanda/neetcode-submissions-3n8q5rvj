class Solution {
    public boolean isArraySpecial(int[] arr) {
        for (int i=1;i<arr.length-1;i++){
    if (arr[i-1] %2  == arr[i]%2 ){
        return false ;
    }
   
    }
  
        
        return true;
    }
}