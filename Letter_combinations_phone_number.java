import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Letter_combinations_phone_number {

    public List<String> letterCombinations(String digits) {

        Map<Integer,String> mp = new HashMap<>();
        mp.put(2,"abc");
        mp.put(3,"def");
        mp.put(4,"ghi");
        mp.put(5,"jkl");
        mp.put(6,"mno");
        mp.put(7,"pqrs");
        mp.put(8,"tuv");
        mp.put(9,"wxyz");

        List<String> result = new ArrayList<>();
        combinations(digits,0,"",result,mp);
        return result;       
    }
    void combinations(String digits,int index,String str,List<String> result,Map<Integer,String> mp)
    {
        if(digits.length()==0) return;

        if(index==digits.length())
        {
            result.add(str);
            return;
        }

        String s = mp.get(digits.charAt(index)-'0');
        for(int i=0;i<s.length();i++)
        {
            combinations(digits,index+1,str+s.charAt(i),result,mp);
        }
    }
    
}
