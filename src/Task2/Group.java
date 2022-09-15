package Task2;

import java.util.List;

public class Group {
    private List<Student> students;
    private List<TypesOfSubject> typesOfSubject;
    private String name;

    public Group(final List<Student> students, final List<TypesOfSubject> typesOfSubject, final String name) {
        this.students = students;
        this.typesOfSubject = typesOfSubject;
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }

    public List<TypesOfSubject> getTypesOfSubject() {
        return typesOfSubject;
    }

    public void setTypesOfSubject(final List<TypesOfSubject> typesOfSubject) {
        this.typesOfSubject = typesOfSubject;
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
                ", typesOfSubject=" + typesOfSubject +
                ", students=" + students + '\'' +
                '}';
    }
}
