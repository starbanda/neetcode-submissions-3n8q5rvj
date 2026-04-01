class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s:emails){
            String e = s.substring(0,s.indexOf('@'));
            String d =s.substring(s.indexOf('@'),s.length());
           
             if (e.contains("+")){

             e= e.substring(0,e.indexOf('+'));

            }
             set.add(e.replace(".", "")+d);
        }
        return set.size();
    }
} 