package Task2;

import java.util.List;

public class Group {
    private List<Student> students;
    private List<Subject> subjects;
    private String name;

    public Group(final List<Student> students, final List<Subject> subjects, final String name) {
        this.students = students;
        this.subjects = subjects;
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }

    public List<Subject> getSubject() {
        return subjects;
    }

    public void setSubject(final List<Subject> typesOfSubject) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name +
                ", subjects=" + subjects +
                ", students=" + students + '\'' +
                '}';
    }
}
