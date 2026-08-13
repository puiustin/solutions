class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(String str : strs){
            int[] count = new int[26];
            for(int i = 0; i < str.length(); i++){
                count[str.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(count);
            groups.putIfAbsent(key, new ArrayList<String>());
            groups.get(key).add(str);
        }
        return new ArrayList<>(groups.values());
    }

}