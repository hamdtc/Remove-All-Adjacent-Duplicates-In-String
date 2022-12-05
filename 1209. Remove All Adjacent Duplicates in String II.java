class Solution {
    public String removeDuplicates(String s, int k) {
       
        int n=s.length();
         // we have not doubt that we should have itarate through entire string
        // we will store the element in the stack 
        // we will store count of each element 
        //but in another stack we keep track of count
        // so we can remove when ever it reaches the k element
        Stack<Character> st=new Stack<>();
        Stack<Integer> countst=new Stack<>();
        // check for the consicutive element
        // from right to left
        
        for(int i=n-1;i>=0;i--){
            
            char c=s.charAt(i);
            //first we have check the above element in the st
            
            if(st.size()>0 && st.peek()==c) countst.push(countst.peek()+1);
            else countst.push(1);
            
            st.push(c);
            
            //whenever reaches the k element consicutively
            if(countst.peek()==k){
                int j=k;
                while(j>0){
                    st.pop();
                    countst.pop();
                    j--;
                }
            }
        }
        
        // we get the left over elements then appant with ans
        String ans="";
        while(st.size()>0) ans+=st.pop();
        return ans;
        
    }
}