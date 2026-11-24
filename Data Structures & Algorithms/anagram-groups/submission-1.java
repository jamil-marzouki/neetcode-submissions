class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // 1. Sort the letters: "cat" -> "act", "tops" -> "opst"
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);

            // 2. If this key is new, create an empty group for it
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // 3. Add the word to its group
            map.get(key).add(word);
        }

        // 4. Return all the groups
        return new ArrayList<>(map.values());
    }
        
    

    
}