package Task2;


import java.util.List;

public class Student {
    private List<Subject> subjects;
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Student(final String fullName, final List<Subject> subjects) {
        this.fullName = fullName;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{\n" +
                "fullName=\n" + fullName +
                "\nsubjects=\n" + subjects + '\'' +
                '}';
    }
}
