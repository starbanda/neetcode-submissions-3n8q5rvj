class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        Map<String, Integer> freq = new HashMap<>();
        
        for (String s : arr) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>();

        for (String s : arr) {
            if (freq.get(s) == 1) {
                list.add(s);
            }
        }

        if (k > list.size()) {
            return "";
        }

        return list.get(k - 1);
    }
}