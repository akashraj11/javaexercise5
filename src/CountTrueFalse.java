import java.util.HashMap;
import java.util.Map;

public class CountTrueFalse {
    public Map<String,Boolean> countTrueFalse(String[] input){
        Map<String,Boolean> map=new HashMap<String,Boolean>();
        String[] tempString;
        int counta=0,countb=0,countc=0,countd=0;
        for(String s:input){
            if(s == "a"){
                counta++; }
            if(s == "b")
                countb++;
            if(s == "c")
                countc++;
            if(s == "d")
                countd++;
        }
        if(counta>=2)
            map.put("a",true);
        else
            map.put("a",false);
        if(countb>2)
            map.put("b",true);
        else
            map.put("b",false);
        if(countc>2)
            map.put("c",true);
        else
            map.put("c",false);
        if(countd>2)
            map.put("d",true);
        else
            map.put("d",false);
        return map;
    }
}
