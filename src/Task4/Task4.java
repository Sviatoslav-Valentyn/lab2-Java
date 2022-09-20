package Task4;

import Task2.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(final String[] args) {

        final LocalDate date1 = LocalDate.of(2022, 1, 10);
        final LocalDate date2 = LocalDate.of(2022, 2, 20);
        final LocalDate date3 = LocalDate.of(2022, 3, 25);
        final Subject subject1 = new Subject("Higher Mathematics", date1);
        final Subject subject2 = new Subject("Algorithmization", date2);
        final Subject subject3 = new Subject("History", date3);
        final Student student1 = new Student(Stream.of(
                subject1, subject2, subject3).collect(Collectors.toList()),"Hvozdyk Sviatoslav-Valentyn Ruslanovych",
                new Mark(5));
        final Student student2 = new Student(Stream.of(
                subject1, subject2, subject3).collect(Collectors.toList()),"Hamaiunov Oleksandr",
        new Mark(5));
        final  Student student3 = new Student(Stream.of(
                subject1, subject2, subject3).collect(Collectors.toList()),"Khrapchun Roman Sergiyovuch",
                new Mark(5));
        final AssessmentJournal journal = new AssessmentJournal(
        new HashMap<>(){{
            put(student1, new HashMap<>(){{
                put(subject1, new Mark(4));
                put(subject2, new Mark(5));
                put(subject3, new Mark(5));
            }});
            put(student2, new HashMap<>(){{
                put(subject1, new Mark(5));
                put(subject2, new Mark(5));
                put(subject3, new Mark(5));
            }});
            put(student3, new HashMap<>(){{
                put(subject1, new Mark(3));
                put(subject2, new Mark(4));
                put(subject3, new Mark(3));
            }});
        }});

        System.out.println(journal);
        System.out.println(" ");
        journal.changeMark(student1,subject1, new Mark(5));
        System.out.println(journal);
        System.out.println(" ");
        journal.getMarkByStudent(student1).forEach((subject, mark) -> System.out.println(student1.getFullName() + " " + subject.getName() + " " + mark));
        System.out.println(" ");
        journal.getMarkBySubject(subject2).forEach(((student, mark) -> System.out.println(student.getFullName() + " " + subject2.getName() + " " + mark)));
    }
}
