class Solution {
    public int findLucky(int[] arr) {
     Map <Integer,Integer> map = new HashMap<>();
     for (int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
     }
     
        return map.entrySet().stream()
                        .sorted(Map.Entry.<Integer,Integer>comparingByKey().reversed())
                        .filter(e -> e.getKey().equals(e.getValue()))
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(-1) ;
                        

    }
}

     
    