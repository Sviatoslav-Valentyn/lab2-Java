package Task4;



import Task2.*;
import Task3.service.AlphabeticalOrderOfStudents;
import Task3.service.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssessmentJournal {
    private Map<Student, Map<Subject, Mark>> marksStudents;

    public void setMarksStudents(final Map<Student, Map<Subject, Mark>> marksStudents) {
        this.marksStudents = marksStudents;
    }

    public AssessmentJournal(final Map<Student, Map<Subject, Mark>> marksStudent) {
        this.marksStudents = marksStudents;
    }

    //всі оцінки одного студента
    public Map<Subject, Mark> getStudentMark(final Student name) {
        return marksStudents.get(name);
    }
//    public static Map<Student, Map<Subject, Mark>> getMarksByStudent(final University university, final Student nameStudent) {
//        final AssessmentJournal assessmentJournal = new AssessmentJournal();
//        return assessmentJournal.getMarksStudents();
//    }

    //Зміна оцінки
    public void setMarkSubject(final Student student, final Subject subject ,final Mark mark) {
        marksStudents.get(student).put(subject,mark);
    }


//    public AssessmentJournal(final University university) {
//        this.marksStudents = new HashMap<Student, Map<Subject, Mark>>();
//        final AlphabeticalOrderOfStudents sortStudent = new AlphabeticalOrderOfStudents(university);
//        final List<Student> listStudents = sortStudent();
//
//        for (final Student student : listStudents) {
//            final Map<Subject, Mark> marksSubjects = new HashMap<Subject, Mark>();
//
//        }
//    }


//    public void changeMark(final String nameStudent, final Mark mark) {
//        final Service service = new Service(university);
//        service.getStudentsByName(nameStudent).setMark(mark);
//    }

//    public Mark getMarksByStudent(final University university, final String nameStudent) {
//        final AssessmentJournal assessmentJournal = new AssessmentJournal(nameStudent, university);
//        return assessmentJournal.getMarks();
//    }

    public static List<Integer> getMarksBySubject(final University university, final String nameSubject) {
        final List<Integer> marks = new ArrayList<>();
        for (final Group group : university.getGroups()) {
            for (final Subject subject : group.getSubject()) {
                if (subject.getName().equals(nameSubject)) {
                    marks.addAll(subject.getMark().values());
                }
            }
        }
        return marks;
    }
}
    public Map<Student, Map<Subject, Mark>> getMarksStudents() {
        return marksStudents;
    }

    @Override
    public String toString() {
        return "AssessmentJournal{" +
                "marksStudents=" + marksStudents +
                '}';
    }
}