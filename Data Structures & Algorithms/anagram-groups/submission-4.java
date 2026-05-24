class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        int[] arr = new int[26];
        for (String str: strs) {
            char[] chars = str.toCharArray();
            for (char c: chars) {
                arr[c-'a']++;
            }
            String signature = Arrays.stream(arr)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining("#"));
            map.computeIfAbsent(signature, k -> new ArrayList<>()).add(str);

            Arrays.fill(arr, 0);
        }

        return new ArrayList<>(map.values());
    }
}
