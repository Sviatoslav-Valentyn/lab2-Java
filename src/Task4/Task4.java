package Task4;

import Task2.*;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(final String[] args) {
        final LocalDate date1 = LocalDate.of(2022, 1, 10);
        final LocalDate date2 = LocalDate.of(2022, 2, 20);
        final LocalDate date3 = LocalDate.of(2022, 3, 25);
        final University Lviv_Polytechnic = new University(Stream.of(
                new Group(Stream.of(
                        new Student(Stream.of(
                                new Subject("Higher Mathematics", date1),
                                new Subject("Algorithmization", date2),
                                new Subject("History", date3)
                        ).collect(Collectors.toList()), "Hvozdyk Sviatoslav-Valentyn Ruslanovych", new Mark(5)),
                        new Student(Stream.of(
                                new Subject("Higher Mathematics", date1),
                                new Subject("History", date3)
                        ).collect(Collectors.toList()), "Shelvakh Maksym Andriyovych", new Mark(4))).collect(Collectors.toList()),
                        Stream.of(
                                new Subject("Higher Mathematics", date1),
                                new Subject("Algorithmization", date2),
                                new Subject("History", date3)
                        ).collect(Collectors.toList()), "IT-21"),
                new Group(Stream.of(
                        new Student(Stream.of(
                                new Subject("Higher Mathematics", date1),
                                new Subject("Algorithmization", date2),
                                new Subject("History", date3)
                        ).collect(Collectors.toList()), "Khrapchun Roman Sergiyovuch", new Mark(3)),
                        new Student(Stream.of(
                                new Subject("Higher Mathematics", date1),
                                new Subject("History", date3)
                        ).collect(Collectors.toList()), "Hamaiunov Oleksandr", new Mark(2))).collect(Collectors.toList()),
                        Stream.of(
                                new Subject("Higher Mathematics", date1),
                                new Subject("Algorithmization", date2),
                                new Subject("History", date3)
                        ).collect(Collectors.toList()), "IT-22")

        ).collect(Collectors.toList()));


        System.out.println(Lviv_Polytechnic);

        final AssessmentJournal assessmentJournal = new AssessmentJournal(Lviv_Polytechnic);
        for{ }
        assessmentJournal.getMarksStudents()



        assessmentJournal.changeMark("Hamaiunov Oleksandr", new Mark(5));

    }
}
