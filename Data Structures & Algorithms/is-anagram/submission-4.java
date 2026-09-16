class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        var sMap = new HashMap<String, Integer>(mapAnagram(s));
        var tMap = new HashMap<String, Integer>(mapAnagram(t));

        if (sMap.equals(tMap)) return true;
        
        return false;
    }

    private HashMap<String, Integer> mapAnagram(String word) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            String character = String.valueOf(word.charAt(i));

            hashMap.put(character, hashMap.getOrDefault(character, 0) + 1);
        } 
        return hashMap;
    }
}
