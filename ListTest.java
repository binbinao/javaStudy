import java.util.*;

public class ListTest{
    public List<Student> students;

    public ListTest(){
        this.students = new ArrayList<Student>();
    }

    public void testAdd(){
        Student st1 = new Student("1", "Zhang San");
        students.add(st1);

        Student temp1 = students.get(0);
        System.out.println("Add student:"+temp1.id+":"+temp1.name);

        Student st2 = new Student("2", "Li Si");
        students.add(st2);

        Student temp2 = students.get(0);
        System.out.println("Add student:"+temp2.id+":"+temp2.name);

        Student[] student = {new Student("3","Wang Wu"), new Student("4", "Ma Liu")};
        students.addAll(Arrays.asList(student));

        Student temp3 = students.get(2);
        Student temp4 = students.get(3);
        System.out.println("Add student:"+temp3.id+":"+temp3.name);
        System.out.println("Add student:"+temp4.id+":"+temp4.name);


    public void testGet(){
        int size = student.size();
        for(int i=0; i<size; i++){
            Student st=students.get(i);
            System.out.println("Student:"+st.id+":"+st.name);
        }
    }



    public static void main(String[] args){
        ListTest lt = new ListTest();
        lt.testAdd();
        lt.testGet();
    }
}