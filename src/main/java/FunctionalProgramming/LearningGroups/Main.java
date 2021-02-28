package FunctionalProgramming.LearningGroups;
import java.nio.file.attribute.GroupPrincipal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Display all students in a group sorted alphabetically by lastName +
 * Display the group with the maximum number of students +
 * Display all students younger than 25, from all groups
 * Display all students grouped by trainer that teaches to them (eg. Trainer1 - stud1, stud3, stud4; Trainer2 - stud2, stud 10) - regardless of the group they're part of (If you were to store this information in a data structure what would you use?)
 * Display all students with previous java knowledge
 * Display the group with the highest number of students with no previous java knowledge
 * Remove all the students younger than 20 from all groups
 */

public class Main {
    public static void main(String[] args) {
       GroupManagement groupManagement = new GroupManagement();
        /**
         * Get list of sorted names per 1 group
         */
       groupManagement.sortGroupStudentsByLastName(GroupsDatabase.getGroup2());
        groupManagement.getGroupWithMaximumStudents(GroupsDatabase.getGrupiuSaras());
    }
}