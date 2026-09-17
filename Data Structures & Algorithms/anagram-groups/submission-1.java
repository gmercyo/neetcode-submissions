class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        HashMap<String, List<String>> map= new HashMap<>();

        for (String str : strs) {
           String sortedStr = sortStr(str); 
           map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());        
    }

    private String sortStr(String str) {
        
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        
        return sorted;
    }
}
