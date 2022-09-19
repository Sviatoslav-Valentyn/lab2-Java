package Task2;

import java.time.LocalDate;
import java.util.List;

public class Student {
    private List<Subject> subjects;
    private String fullName;
    private Mark mark;

    public Student(final List<Subject> subjects, final String fullName, final Mark mark) {
        this.subjects = subjects;
        this.fullName = fullName;
        this.mark = mark;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(final Mark mark) {
        this.mark = mark;
    }

    public void addSubject(final String subject) {
        final LocalDate date;
        date = null;
        subjects.add(new Subject(subject, null)); }
    public void addSubject(final Subject subject)
    {
        subjects.add(subject);
    }
    @Override
    public String toString() {
        return "Student{\n" +
                "fullName=\n" + fullName +
                "\nsubjects=\n" + subjects +
                "Rating:" + mark +
                '}';
    }
}
