import java.util.*;
public class CountStringOccurance {
    public Map<String,Integer> countStringOccurance(String input){
        Map<String,Integer> map=new HashMap<String,Integer>();
        String[] tempString;
        int countOne=0,countTwo=0,countThree=0;
        countOne = input.split("one").length - 1;
        countTwo = input.split("two").length -1;
        countThree = input.split("three").length - 1;
        map.put("one",countOne);
        map.put("two",countTwo);
        map.put("three",countThree);
        return map;
    }

}
