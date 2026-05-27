class Solution {
    public int maxScore(String s) {
     char  [] arr = s.toCharArray();
     int  z = 0;
     int o =0;
     int max =0;
     for (char i:arr){
        if (i =='1'){
            o++;
        }
     }
  
    
for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '0') {
                z++;
            } else {
                o--;
            }

         max= Math.max(max,z+o);

     }
     return max ;

    }
}
