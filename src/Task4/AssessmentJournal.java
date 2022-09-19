package Task4;



import Task2.*;
import Task3.service.AlphabeticalOrderOfStudents;
import Task3.service.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssessmentJournal {
    private Map<Student, Map<Subject, Mark>> marksStudents;


    public AssessmentJournal(final Map<Student, Map<Subject, Mark>> marksStudent) {
        this.marksStudents = marksStudents;
    }

    public AssessmentJournal(final University university) {
        this.marksStudents = new HashMap<Student, Map<Subject, Mark>>();
        final AlphabeticalOrderOfStudents sortStudent = new AlphabeticalOrderOfStudents(university);
        final List<Student> listStudents = sortStudent();

        for (final Student student : listStudents) {
            final Map<Subject, Mark> marksSubjects = new HashMap<Subject, Mark>();

        }
    }


//    public void changeMark(final String nameStudent, final Mark mark) {
//        final Service service = new Service(university);
//        service.getStudentsByName(nameStudent).setMark(mark);
//    }

//    public Mark getMarksByStudent(final University university, final String nameStudent) {
//        final AssessmentJournal assessmentJournal = new AssessmentJournal(nameStudent, university);
//        return assessmentJournal.getMarks();
//    }

    public Map<Student, Map<Subject, Mark>> getMarksStudents() {
        return marksStudents;
    }



}