class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (String str: strs) {
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            String signature = new String(sorted);
            map.computeIfAbsent(signature, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
