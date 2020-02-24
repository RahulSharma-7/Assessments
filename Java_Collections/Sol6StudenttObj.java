//Write a program to sort the Student objects based on Score ,
// if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    String name;
    Double score;
    Double age;

    public Student(String name,Double  score,Double age)
    {
        this.name=name;
        this.score=score;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public String toString()
    {
        return "Name: "+this.name+ " Age: "+this.age+" Score:" +this.score;

    }
}

public class Sol6StudenttObj {

public static void main(String args[]) {
    List<Student> list = new ArrayList<Student>();
    list.add(new Student("max", 13d, 16.0));
    list.add(new Student("mick", 14.00, 17.0));
    list.add(new Student("jack", 13.0, 16.0));
    list.add(new Student("john", 10.00, 17.0));


    System.out.println(list);

    Collections.sort(list, new Comparator<Student>() {
        @Override
        public int compare(Student student, Student t1) {
            if(student.score!=t1.score)
                return (int) (student.score-t1.score);
           else
               {

                return t1.name.compareTo(student.name);
        }}
    });
    System.out.println(list);

}

}
