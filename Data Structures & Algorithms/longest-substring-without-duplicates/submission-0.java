class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int start = 0;
        int result = 1;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);

        for (int i=1; i<s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i);
            }
            else {
                int pos = map.get(c);
                if (pos < start) {
                    
                } else {
                    start = pos+1;
                }
                map.put(c, i);
            }
            result = Math.max(result, i-start+1);
        }
        return result;
    }
}
