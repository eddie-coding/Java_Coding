import java.util.ArrayList;
import java.util.List;

public class generate_parenthesis {
    public List<String> generateParenthesis(int n) {

        List<String> result= new ArrayList<>();

        generate(0,0,"",n,result);

        return result;       
    }

    void generate(int open,int close, String str,int n,List<String> result)
    {
        if(close==n)
        {
            result.add(str);
            return;
        }
        if(open<n) generate(open+1,close,str+'(',n,result);

        if(close<open) generate(open,close+1,str+')',n,result);
    }
    
}
