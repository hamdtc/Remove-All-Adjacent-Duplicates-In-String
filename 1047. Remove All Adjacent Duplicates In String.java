class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
// we have to  check the prevoins element int the string
        // stack is the best way to store previous element
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==st.peek()){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        // if we traverse from back then it will add directly
        // here we can add pop element in front
        String ret="";
        while(!st.isEmpty()){
            ret=st.pop()+ret;
            
        }
        return ret;
     
    }
}