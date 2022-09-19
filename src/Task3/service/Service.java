package Task3.service;

import Task2.Student;
import Task2.Subject;
import Task2.Group;
import Task2.University;

import java.security.InvalidParameterException;

public class Service {
    protected University university;

    public Group getGroupByName(final String name) {
        for (final Group group : university.getGroups())
        {
            if (group.getName().equals(name))
            {
                return group;
            }
        }
        throw new InvalidParameterException("No such group");
    }

    public Student getStudentsByName(final String name) {
        for (final Group group : university.getGroups())
        {
            for (final Student student : group.getStudents())
            {
                if (student.getFullName().equals(name))
                {
                    return student;
                }
            }
        }
        throw new InvalidParameterException("No such student");
    }

    public Subject getSubjectsByName(final String nameGroup, final String nameSubject) {
        for (final Subject subject : getGroupByName(nameGroup).getSubject())
        {
            if (subject.getName().equals(nameSubject))
            {
                return subject;
            }
        }
        throw new InvalidParameterException("No such subject");
    }

    public Service(final University university) {
        this.university = university;
    }
}
