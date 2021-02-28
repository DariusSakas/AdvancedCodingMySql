package FunctionalProgramming.LearningGroups;

import javafx.concurrent.Task;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupManagement {
    public void sortGroupStudentsByLastName(Group group) {

        List<Student> sortedStudents = group.getStudentList()
                .stream().sorted(Comparator.comparing(student -> student.getFirstName()))
                .collect(Collectors.toList());

        for (Student sortedStudent : sortedStudents) {
            System.out.println(sortedStudent.getFirstName());
        }
    }

    public void getGroupWithMaximumStudents(List<Group> listOfGroups) {
        List<Group> sortedGroups = listOfGroups
                .stream().sorted(Comparator.comparing(group -> group.getStudentList().size())).collect(Collectors.toList());

        Collections.reverse(sortedGroups);
        for (Group sortedGroup : sortedGroups) {
            System.out.println(sortedGroup.getName());
        }
    }
}
