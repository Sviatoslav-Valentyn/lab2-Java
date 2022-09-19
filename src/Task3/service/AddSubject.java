package Task3.service;

import Task2.Student;
import Task2.Subject;
import Task2.Group;
import Task2.University;

import java.time.LocalDate;
import java.util.List;


public class AddSubject extends Service{

    public AddSubject(final University university) {
        super(university);
    }

    public void addSubject(final String nameGroup, final Subject subject) {
        getGroupByName(nameGroup).getSubject().add(subject);

    }
    public void addSubject(final String nameGroup, final String nameSubject) {
        final Group group = getGroupByName(nameGroup);
        final List<Student> students = group.getStudents();
        final Subject subject = new Subject(nameSubject, LocalDate.of(2022,10,22));
        addSubject(nameGroup, subject);
    }
}
