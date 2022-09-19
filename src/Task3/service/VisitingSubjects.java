package Task3.service;

import Task2.Group;
import Task2.Student;
import Task2.Subject;

import Task2.University;

import java.util.ArrayList;
import java.util.List;

public class VisitingSubjects extends Service {
    public VisitingSubjects(final University university) {
        super(university);
    }

    public void outPutStudents(final String nameSubject) {
        final List<Student> studentList = new ArrayList<>();
        for (final Group group : university.getGroups()){
            for( final Student i : group.getStudents()){
                for( final Subject j : i.getSubjects()){
                    if(j.getName().equals(nameSubject)){
                        studentList.add(i);
                    }
                }
            }
        }
        System.out.println(studentList);
    }
}
