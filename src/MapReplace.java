import javafx.beans.binding.ObjectBinding;

import java.util.HashMap;
import java.util.Map;

public class MapReplace {
    public Map<String,Object> mapReplace(Map<String,Object> input){
        Object value = " ";
        Map<String,Object> map=new HashMap<String, Object>();
        for(Map.Entry m:input.entrySet()){
            // String key= m.getKey();
            // String val=m.getValue();
            if(m.getKey() == "val1")
            {
                if(m.getValue() != null){
                   value = m.getValue();
                    map.put("val1"," ");
                }
            }
        }
        map.put("val2",value);
        return map;
    }
}
