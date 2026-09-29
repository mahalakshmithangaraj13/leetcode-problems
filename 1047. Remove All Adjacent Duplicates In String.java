class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> str=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!str.isEmpty() && str.peek()==s.charAt(i)) str.pop();
            else str.push(s.charAt(i));
        }
        StringBuilder ans=new StringBuilder();
        for(char c:str)
           ans.append(c);
        return ans.toString();
    }
}
