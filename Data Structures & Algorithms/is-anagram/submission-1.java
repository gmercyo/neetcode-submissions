class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        var sMap = new HashMap<String, Integer>();
        var tMap = new HashMap<String, Integer>();

        sMap = mapAnagram(s);
        tMap = mapAnagram(t);

        if (sMap.equals(tMap)) {
             return true;
    }
        return false;
        }

    private HashMap<String, Integer> mapAnagram(String word) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            String character = String.valueOf(word.charAt(i));

            if (hashMap.containsKey(character)) {
                hashMap.replace(character, hashMap.get(character) + 1);
            } else {
                hashMap.putIfAbsent(character, 1);
            }
        } 
        return hashMap;
    }
}
