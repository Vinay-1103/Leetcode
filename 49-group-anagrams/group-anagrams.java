class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // convert to char array
            char[] arr = word.toCharArray();
            // sort characters
            Arrays.sort(arr);
            // make key
            String key = new String(arr);
            // add to map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        // return grouped anagrams
        return new ArrayList<>(map.values());
    }
}