class Solution {
    public String generateFreq(String str){
        int freq[]= new int[26];
        for(char ch:str.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder frequencyStr=new StringBuilder();
        char ch='a';
        for(int i:freq){
            frequencyStr.append(ch);
            frequencyStr.append(i);
            ch++;
        }
        return frequencyStr.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0)return new ArrayList<>();

        Map<String,List<String>> freqMap=new HashMap<>();

        for(String str:strs){
            String freqStr=generateFreq(str);

            if(freqMap.containsKey(freqStr)){
                freqMap.get(freqStr).add(str);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(str);
                freqMap.put(freqStr,list);
            }
        }
        return new ArrayList<>(freqMap.values());
    }
}