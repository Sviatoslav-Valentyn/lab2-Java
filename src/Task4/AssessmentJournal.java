package Task4;



import Task2.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AssessmentJournal {
    private Map<Student, Map<Subject, Mark>> marksStudents;


    public Map<Student, Map<Subject, Mark>> getMarksStudents() {
        return marksStudents;
    }

    public void setMarksStudents(final Map<Student, Map<Subject, Mark>> marksStudents) {
        this.marksStudents = marksStudents;
    }

    public AssessmentJournal(final Map<Student, Map<Subject, Mark>> marksStudents) {
        this.marksStudents = marksStudents;
    }

    public Map<Subject, Mark> getMarkByStudent(final Student student) {
        return marksStudents.get(student);
    }

    public Map<Student, Mark> getMarkBySubject(final Subject subject) {
        final Map<Student, Mark> mapMarkByStudent = new HashMap<Student, Mark>();

        final Set<Student> set = marksStudents.keySet().stream().filter(e -> e.getSubjects().contains(subject)).collect(Collectors.toSet());
        set.forEach(e -> mapMarkByStudent.put(e, marksStudents.get(e).get(subject)));
        return  mapMarkByStudent;
    }

    public void changeMark(final Student student, final Subject subject ,final Mark mark) {
        marksStudents.get(student).put(subject,mark);
    }

    @Override
    public String toString() {
        return "AssessmentJournal{" +
                "marksStudents=" + marksStudents +
                '}';
    }
}