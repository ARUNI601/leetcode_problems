class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String[] words = paragraph.split("\\s+");
        List<String> list = new ArrayList<>(Arrays.asList(words));
        for(int i = 0; i < banned.length; i++) {
            while(list.remove(banned[i].toLowerCase()));
        }
        for(int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            if(map.containsKey(word)) {
                map.merge(word, 1, Integer::sum);
            }
            else {
                map.put(word, 1);
            }
        }
        int max = 0;
        String keys = "";
        for(String key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                keys = key;
            }
        }
        return keys;
    }
}