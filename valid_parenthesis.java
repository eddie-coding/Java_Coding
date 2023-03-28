import java.util.Stack;

public class valid_parenthesis {

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        int n=s.length();
        if(n==1) return false;

        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='[') st.push(c);
            else
            {
                if(st.empty()) return false;
                if((c==')' && st.peek()=='(') || (c==']' && st.peek()=='[') || (c=='}' && st.peek()=='{')) st.pop();
                else return false;
            }
        }
        return st.empty();        
    }
    
}
