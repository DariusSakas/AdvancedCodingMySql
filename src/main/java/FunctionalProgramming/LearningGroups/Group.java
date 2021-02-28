package FunctionalProgramming.LearningGroups;

import java.util.List;

public class Group {
    private List<Student> studentList;
    private Trainer trainer;
    private String name;

    public Group(List<Student> student, Trainer trainer, String name) {
        this.studentList = student;
        this.trainer = trainer;
        this.name = name;
    }

    public Group(List<Student> studentList, String name) {
        this.studentList = studentList;
        this.name = name;
        System.out.println("No trainer in this group");
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Group{" +getName()+
                "student=" + studentList +
                ", trainer=" + trainer +
                ", name='" + name + '\'' +
                '}';
    }

}
