package Task2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(final String[] args) {
        final University Lviv_Polytechnic = new University(Stream.of(
                new Group(Stream.of(
                        new Student("Hvozdyk Sviatoslav-Valentyn Ruslanovych", Stream.of(
                                new Subject("Higher Mathematics", new Mark(5), new Date(24, 2, 2022)),
                                new Subject("Algorithmization", new Mark(4), new Date(24, 2, 2022)),
                                new Subject("History", new Mark(3), new Date(24, 02, 2022))).collect(Collectors.toList())),
                        new Student("Shelvakh Maksym Andriyovych", Stream.of(
                                new Subject("Higher Mathematics", new Mark(5), new Date(24, 2, 2022)),
                                new Subject("Algorithmization", new Mark(5), new Date(24, 2, 2022)),
                                new Subject("History", new Mark(5), new Date(24, 02, 2022))).collect(Collectors.toList())))
                        .collect(Collectors.toList()), Stream.of(
                        new TypesOfSubject("Higher Mathematics"),
                        new TypesOfSubject("Algorithmization"),
                        new TypesOfSubject("History")
                ).collect(Collectors.toList()), "IT-21"),
                new Group(Stream.of(
                                new Student("Khrapchun Roman Sergiyovuch", Stream.of(
                                        new Subject("Higher Mathematics", new Mark(5), new Date(24, 02, 2022)),
                                        new Subject("Algorithmization", new Mark(4), new Date(24, 02, 2022)),
                                        new Subject("History", new Mark(5), new Date(24, 02, 2022))).collect(Collectors.toList())),
                        new Student("Bakhmat Kateryna Yuriivna", Stream.of(
                                new Subject("Higher Mathematics", new Mark(5), new Date(24, 02, 2022)),
                                new Subject("Algorithmization", new Mark(4), new Date(24, 02, 2022)),
                                new Subject("History", new Mark(4), new Date(24, 02, 2022))).collect(Collectors.toList())),
                        new Student("Hamaiunov Oleksandr Andriyovych", Stream.of(
                                new Subject("Higher Mathematics", new Mark(5), new Date(24, 02, 2022)),
                                new Subject("Algorithmization", new Mark(5), new Date(24, 02, 2022)),
                                new Subject("History", new Mark(5), new Date(24, 02, 2022))).collect(Collectors.toList())))
                                .collect(Collectors.toList()), Stream.of(
                        new TypesOfSubject("Higher Mathematics"),
                        new TypesOfSubject("Algorithmization"),
                        new TypesOfSubject("History")
                ).collect(Collectors.toList()), "IT-22")).collect(Collectors.toList()));

        System.out.println(Lviv_Polytechnic);
    }
}