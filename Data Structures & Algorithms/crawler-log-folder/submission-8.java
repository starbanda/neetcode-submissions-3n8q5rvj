

class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for (String s : logs) {
            if (s.equals("../")) {
                if (!st.isEmpty()) st.pop();   // go up if possible
            } else if (s.equals("./")) {
                // no-op
            } else {
                st.push(s);                    // push folder like "a/", "b/", "1/", etc.
            }
        }
        return st.size();
    }
}