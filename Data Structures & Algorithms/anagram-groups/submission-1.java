class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (String str: strs) {
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            String signature = new String(sorted);
            map.putIfAbsent(signature, new ArrayList<String>());
            List<String> coll = map.get(signature);
            coll.add(str);
        }

        Collection<List<String>> collection = map.values();
        return new ArrayList<>(collection);
    }
}
