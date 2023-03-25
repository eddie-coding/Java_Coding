package Strings;

public class zig_zag {

    public String convert(String s, int numRows) {

        if(numRows==1) return s;
        int row=0;
        StringBuilder[] sbs= new StringBuilder[numRows];
        boolean down =true;

        for(int i=0;i<numRows;i++)
        {
            sbs[i]=new StringBuilder();
        }
        char[] chars = s.toCharArray();
        for(char c: chars)
        {
            sbs[row].append(c);
            if(row==0) down =true;
            else if(row==numRows-1) down =false;
            row = ((down)? row+1:row-1);
            //System.out.println("ROW_NUMBER:"+ row);
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder sb: sbs) result.append(sb);
        
        return result.toString();
        
    }
    
}
