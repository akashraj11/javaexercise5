import java.util.*;
public class SortNames {
    public ArrayList<String> sortNames(ArrayList list){
        TreeSet<String> sortedNames =new TreeSet<String>();
        sortedNames.addAll(list);
        Iterator<String> itr=sortedNames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        list.clear();
        list.addAll(sortedNames);
        return list;
    }

}

