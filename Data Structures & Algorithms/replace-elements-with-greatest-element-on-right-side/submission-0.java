class Solution {
    public int[] replaceElements(int[] arr) {
        int r = -1;
        for (int i=arr.length-1;i>=0;i--){
          int current = arr[i];
          arr[i] =r;
           if (current >r){
            r  =current;
           }
        }
        return arr;
    }
}