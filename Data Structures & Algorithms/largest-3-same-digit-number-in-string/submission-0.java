class Solution {
    public String largestGoodInteger(String num) {
        int  ans =-1;
       for (int  i=1;i<num.length()-1;i++) {
            if (num.charAt(i) == num.charAt(i-1) && num.charAt(i) == num.charAt(i+1)){
                int numb = Integer.parseInt(num.substring(i-1,i+2));
                ans = Math.max(numb, ans);
            }

       }
       
if (ans == -1) return "";
        return String.format("%03d", ans);

    }
}