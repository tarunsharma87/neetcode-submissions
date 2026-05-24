class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str: strs) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> arr = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i+1;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            int start_bound = j+1;
            int end_bound = start_bound + len;
            arr.add(str.substring(start_bound, end_bound));
            i = end_bound;
        }
        return arr;
    }
}
