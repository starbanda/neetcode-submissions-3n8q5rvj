class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map= new HashMap<>();
           for (char c : chars.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
           }
           int sum =0;
         for (String i:words){
              HashMap<Character,Integer> freq= new HashMap<>();
               for (char c : i.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
           }
                boolean add =true;
            for (char c : freq.keySet()){
                if (freq.get(c) >map.getOrDefault(c, 0)){
                    add =false;
                    break;
                }

            }
            if (add){
                sum+=i.length();
            }

         }
         return sum;
    }
}