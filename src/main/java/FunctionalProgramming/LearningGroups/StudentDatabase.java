package FunctionalProgramming.LearningGroups;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    private static List<Student> bendrasSaras = new ArrayList<>();

    private static List<Student> studentuSarasas1 = new ArrayList<>();
    private static List<Student> studentuSarasas2 = new ArrayList<>();
    private static List<Student> studentuSarasas3 = new ArrayList<>();
    private static List<Student> studentuSarasas4 = new ArrayList<>();

    static {

        Student student1 = new Student("Student3", "A", 21);
        Student student2 = new Student("Student2", "B", 23);
        Student student3 = new Student("Student1", "C",26);
        Student student4 = new Student("Student4", "D",28);
        Student student5 = new Student("Student5", "E",22);
        Student student6 = new Student("Student6", "F",18);
        Student student7 = new Student("Student7", "G",19);
        Student student8 = new Student("Student8", "H",25);
        Student student9 = new Student("Student9", "I",23);
        Student student10 = new Student("Student10", "J",19);
        Student student11 = new Student("Student11", "K",29);
        Student student12 = new Student("Student12", "M",30);
        Student student13 = new Student("Student13", "N",27);
        Student student14 = new Student("Student14", "M",25);
        Student student15 = new Student("Student15", "S",21);

        bendrasSaras.add(student1);
        bendrasSaras.add(student2);
        bendrasSaras.add(student3);
        bendrasSaras.add(student4);
        bendrasSaras.add(student5);
        bendrasSaras.add(student6);
        bendrasSaras.add(student7);
        bendrasSaras.add(student8);
        bendrasSaras.add(student9);
        bendrasSaras.add(student10);
        bendrasSaras.add(student11);
        bendrasSaras.add(student12);
        bendrasSaras.add(student13);
        bendrasSaras.add(student14);
        bendrasSaras.add(student15);

        try {
            studentuSarasas1.add(bendrasSaras.get(0));
            studentuSarasas1.add(bendrasSaras.get(1));
            studentuSarasas1.add(bendrasSaras.get(2));

            studentuSarasas2.add(bendrasSaras.get(3));
            studentuSarasas2.add(bendrasSaras.get(4));
            studentuSarasas2.add(bendrasSaras.get(5));

            studentuSarasas3.add(bendrasSaras.get(6));
            studentuSarasas3.add(bendrasSaras.get(7));
            studentuSarasas3.add(bendrasSaras.get(8));
            studentuSarasas1.add(bendrasSaras.get(13));

            studentuSarasas4.add(bendrasSaras.get(9));
            studentuSarasas4.add(bendrasSaras.get(10));
            studentuSarasas4.add(bendrasSaras.get(11));
            studentuSarasas4.add(bendrasSaras.get(12));



            List<List<Student>> listOfStudentList = new ArrayList<>();
            listOfStudentList.add(studentuSarasas1);
            listOfStudentList.add(studentuSarasas2);
            listOfStudentList.add(studentuSarasas3);
            listOfStudentList.add(studentuSarasas4);

            for (List list : listOfStudentList) {
                if(list.size() >= 5 )
                    throw new MaximumNumberOfStudentsReached();
            }
        } catch (MaximumNumberOfStudentsReached ex){
            System.out.println("\"Too many students in the list\"");
        }
    }



    public static List<Student> getStudentuSarasas1() {
        return studentuSarasas1;
    }

    public static List<Student> getStudentuSarasas2() {
        return studentuSarasas2;
    }

    public static List<Student> getStudentuSarasas3() {
        return studentuSarasas3;
    }

    public static List<Student> getStudentuSarasas4() {
        return studentuSarasas4;
    }


}