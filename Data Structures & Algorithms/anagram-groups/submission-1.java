class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> groups = new HashMap<>();

        for (String str : strs) {
            char chars[] = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            groups.computeIfAbsent(sorted, k-> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(groups.values());
    }
}
