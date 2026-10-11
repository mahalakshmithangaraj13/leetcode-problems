class Solution {
    public String removeKdigits(String num, int k) {
       Stack<Integer> stk=new Stack<>();
       for(int i=0;i<num.length();i++){
        int c=num.charAt(i)-'0';
        while(!stk.isEmpty() && stk.peek()>c && k>0){
            stk.pop();
            k--;
        }
        stk.push(c);
       }
       while(k>0){
        stk.pop();
        k--;
       }
    StringBuilder str=new StringBuilder();
    for(int n:stk) str.append(n);
    int i=0;
    while(i<str.length() && str.charAt(i)=='0') i++;
    if(i==str.length()) return "0";
    String res=str.toString();
    return res.substring(i);
    }
}
