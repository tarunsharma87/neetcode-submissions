class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (String str: strs) {
            int[] arr = new int[26];
            char[] chars = str.toCharArray();
            for (char c: chars) {
                arr[c-'a']++;
            }
            String signature = Arrays.stream(arr)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining("#"));
            map.computeIfAbsent(signature, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
