package Task3.service;

import Task2.Student;
import Task2.University;

import java.util.Comparator;
import java.util.List;

public class AlphabeticalOrderOfStudents extends Service {

    public AlphabeticalOrderOfStudents(final University university) {
        super(university);
    }

    public void alphabeticalOrderOfStudents(final String nameGroup) {
        final List<Student> students = getGroupByName(nameGroup).getStudents();
        students.sort(Comparator.comparing(Student::getFullName));
        for(final Student i : students)
            System.out.println(students);
    }
}
