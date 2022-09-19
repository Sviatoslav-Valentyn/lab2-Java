package Task4;

import Task2.*;

import java.time.LocalDate;
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
        final AssessmentJournal journal = new AssessmentJournal(
                Map.of(new Student(Stream.of(
                        subject1, subject2, subject3).collect(Collectors.toList()),"Hvozdyk Sviatoslav-Valentyn Ruslanovych",
                                new Mark(5)), Map.of(subject1, new Mark(4))));
        System.out.println(journal);
    }
}
