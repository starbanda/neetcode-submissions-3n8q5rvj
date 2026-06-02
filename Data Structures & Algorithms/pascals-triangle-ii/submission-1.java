class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        
long val = 1;
list.add((int)val);
        
        for (int i=1;i<rowIndex+1;i++){
           val = val*((rowIndex-i+1))/i;
           list.add((int)val);
            
        }
        return list;
    }
}