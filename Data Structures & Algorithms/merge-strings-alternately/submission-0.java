class Solution {
    public String mergeAlternately(String a, String b) {
        String ans = new String("");
        int i =0;
        int j=0;
        while (i<a.length() && j<b.length()){
            ans+=a.charAt(i);
            ans+=b.charAt(j);
            i++;
            j++;
        }
        if (i!=a.length()){
            ans =ans+ a.substring(i,a.length());

        }
        else{
            ans +=b.substring(j,b.length());

        }
        return ans;
    }
}