class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) == 1) {
                    map.remove(c);
                }
                else {
                    map.put(c, map.get(c)-1);
                }
            } else {
                return false;
            }
        }

        if (map.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
