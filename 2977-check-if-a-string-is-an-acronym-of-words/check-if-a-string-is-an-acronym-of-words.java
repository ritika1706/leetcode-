class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String ans="";
        if(words.size() != s.length()){
            return false;
        }
        for(int i=0;i<words.size();i++){
            ans+=words.get(i).charAt(0);
        }
        if(ans.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}