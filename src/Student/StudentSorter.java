package Student;
import java.util.*;
public class StudentSorter implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if((s1.age == s2.age)!= false || (s1.name.compareTo(s2.name) != 0)){
            if (s1.age == s2.age)
                return s1.name.compareTo(s2.name);
            else if (s1.age > s2.age)
                return -1;
            else
                return 1;
        }
        else
        {
            if (s1.id == s2.id)
                return 0;
            else if (s1.id > s2.id)
                return 1;
            else
                return -1;
        }
    }


}
