package Task4;



import Task2.*;
import Task3.service.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AssessmentJournal {
    private University university;
    private Student student;
    private Mark marks;

    public Student getStudent() {
        return student;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(final University university) {
        this.university = university;
    }

    public void setStudent(final Student student) {
        this.student = student;
    }

    public Mark getMarks() {
        return marks;
    }

    public void setMarks(final Mark marks) {
        this.marks = marks;
    }

    public AssessmentJournal(final University university, final Student student, final Mark marks) {
        this.university = university;
        this.student = student;
        this.marks = marks;
    }

    public AssessmentJournal(final String student, final University university) {
        final Service service = new Service(university);
        this.university = university;
        this.student = service.getStudentsByName(student);
        this.marks = new Mark();
        for (final Group group : university.getGroups()) {
            for (final Student i : group.getStudents()) {
                if (group.getStudents().equals(this.student)) {

                }
            }
        }
    }

    public void changeMark(final String nameStudent, final Mark mark) {
        final Service service = new Service(university);
        service.getStudentsByName(nameStudent).setMark(mark);
    }

    public Mark getMarksByStudent(final University university, final String nameStudent) {
        final AssessmentJournal assessmentJournal = new AssessmentJournal(nameStudent, university);
        return assessmentJournal.getMarks();
    }





}