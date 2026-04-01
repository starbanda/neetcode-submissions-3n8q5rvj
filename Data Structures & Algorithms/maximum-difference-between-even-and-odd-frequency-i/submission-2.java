class Solution {
    public int maxDifference(String s) {
     HashMap <Character, Integer> map = new HashMap<>();
     for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
     map.put(c,map.getOrDefault(c,0)+1)  ;
    }
    int odd=Integer.MIN_VALUE;
    int even =Integer.MAX_VALUE;
     for (Map.Entry<Character,Integer> entry : map.entrySet()) {
           if ( entry.getValue() %2 ==0){
            even =Math.min(entry.getValue(),even);
            
           }
           else {
           odd=Math.max(entry.getValue(),odd);
      
           }     }
  return (odd-even);

    }
}