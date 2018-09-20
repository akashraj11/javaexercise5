package Student;
import Student.StudentSorter;
import java.util.*;
import java.io.*;

public class Maintest {
    public static void main(String args[]){

        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Ajay",23));

        System.out.println("Sorting by Age in Descending order.");

        Collections.sort(al,new StudentSorter());
        for(Student st: al){
            System.out.println(st.id+" "+st.name+" "+st.age);
        }



    }
}
