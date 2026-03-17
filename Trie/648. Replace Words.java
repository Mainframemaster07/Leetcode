class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        int l = dictionary.size();
        String s[] = sentence.split(" ");
        int n = s.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                String S = dictionary.get(j);
                if(S.length() >= s[i].length()) continue;
                if(s[i].substring(0,S.length()).equals(S)) {
                    s[i] = S;
                }
            }
        }
        String res = String.join(" ",s);
        return res;
    }
}
