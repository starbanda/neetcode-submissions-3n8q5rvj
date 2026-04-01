class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> arr = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for (int j=0;j<words.length;j++){
                if (i==j) continue;
                else{
                    if (words[j].contains(words[i])){
                        if(!arr.contains(words[i]))
                        arr.add(words[i]);
                    }
                }
            }
        }
        return arr;
    }
}