class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
     ArrayList<String> st= new ArrayList<>(); 
     for (String i : words){
        if (i.matches("["+ allowed + "]+")){
            st.add(i);
        }
     }
    return st.size();

     
    }
}
