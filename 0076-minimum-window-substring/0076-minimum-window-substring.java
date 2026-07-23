class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        if(s.equals(t))return s;

        int l=0,r=0,count=t.length();
        String output="";
        Map<Character, Integer> charCount=new HashMap<>();

        for(char ch:t.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch,0)+1);
        }

        while(r<s.length()){
            char ch = s.charAt(r);
            if(charCount.containsKey(ch)){
                if(charCount.get(ch)>0)
                    count--;
                charCount.put(ch, charCount.get(ch)-1);
            }

            if(count==0){
                while(l<r){
                    if(charCount.containsKey(s.charAt(l))){
                        boolean isValid= charCount.get(s.charAt(l))+1 <=0 ? true : false ;
                        if(isValid){
                            charCount.put(s.charAt(l),charCount.get(s.charAt(l))+1);
                            l++;
                        }else{
                            break;
                        }
                    }
                    else{
                        l++;
                    }
                }
                String temp=s.substring(l,r+1);
                if(output.isEmpty() || output.length()>temp.length())
                output=temp;
            }
            r++;
        }

        return output;
    }
}