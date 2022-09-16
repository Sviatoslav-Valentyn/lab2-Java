package Task2;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(final String[] args) {
        final LocalDate data1 = LocalDate.of(2022, 1, 10);
        final LocalDate data2 = LocalDate.of(2022, 2, 20);
        final LocalDate data3 = LocalDate.of(2022, 3, 25);
        final University Lviv_Polytechnic = new University(Stream.of(
                new Group(Stream.of(
                        new Student(Stream.of(
                                new Subject("Higher Mathematics", data1),
                                new Subject("Algorithmization", data2),
                                new Subject("History", data3)
                        ).collect(Collectors.toList()), "Hvozdyk Sviatoslav-Valentyn Ruslanovych", new Mark(5)),
                        new Student(Stream.of(
                                new Subject("Higher Mathematics", data1),
                                new Subject("Algorithmization", data2),
                                new Subject("History", data3)
                        ).collect(Collectors.toList()), "Shelvakh Maksym Andriyovych", new Mark(4))).collect(Collectors.toList()),
                        Stream.of(
                                new Subject("Higher Mathematics", data1),
                                new Subject("Algorithmization", data2),
                                new Subject("History", data3)
                        ).collect(Collectors.toList()), "IT-21"),
                new Group(Stream.of(
                        new Student(Stream.of(
                                new Subject("Higher Mathematics", data1),
                                new Subject("Algorithmization", data2),
                                new Subject("History", data3)
                        ).collect(Collectors.toList()), "Khrapchun Roman Sergiyovuch", new Mark(3)),
                        new Student(Stream.of(
                                new Subject("Higher Mathematics", data1),
                                new Subject("Algorithmization", data2),
                                new Subject("History", data3)
                        ).collect(Collectors.toList()), "Hamaiunov Oleksandr", new Mark(2))).collect(Collectors.toList()),
                        Stream.of(
                                new Subject("Higher Mathematics", data1),
                                new Subject("Algorithmization", data2),
                                new Subject("History", data3)
                        ).collect(Collectors.toList()), "IT-22")

        ).collect(Collectors.toList()));


        System.out.println(Lviv_Polytechnic);
    }
}


//
//                        new Student(Stream.of(
//                                new Subject("Higher Mathematics", data1),
//                                new Subject("Algorithmization", data2),
//                                new Subject("History", data3)).collect(Collectors.toList()),
//                                "Hvozdyk Sviatoslav-Valentyn Ruslanovych",new Mark(5)),
//                        new Student(Stream.of(
//                                new Subject("Higher Mathematics", data1),
//                                new Subject("Algorithmization", data2),
//                                new Subject("History", data3)).collect(Collectors.toList()),
//                                "Hvozdyk Sviatoslav-Valentyn Ruslanovych",new Mark(5))).collect(Collectors.toList()),
//                        Stream.of(
//                                new Subject("Higher Mathematics", data1),
//                                new Subject("Algorithmization", data2),
//                                new Subject("History", data3)).collect(Collectors.toList()))).collect(Collectors.toList()));

//
//
//                        .collect(Collectors.toList()), Stream.of(
//                        new Subject("Higher Mathematics"),
//                        new Subject("Algorithmization"),
//                        new Subject("History")
//                ).collect(Collectors.toList()), "IT-21"),
//                new Group(Stream.of(
//                                new Student("Khrapchun Roman Sergiyovuch", Stream.of(
//                                        new Subject("Higher Mathematics", new Mark(5), new Date(24, 02, 2022)),
//                                        new Subject("Algorithmization", new Mark(4), new Date(24, 02, 2022)),
//                                        new Subject("History", new Mark(5), new Date(24, 02, 2022))).collect(Collectors.toList())),
//                        new Student("Bakhmat Kateryna Yuriivna", Stream.of(
//                                new Subject("Higher Mathematics", new Mark(5), new Date(24, 02, 2022)),
//                                new Subject("Algorithmization", new Mark(4), new Date(24, 02, 2022)),
//                                new Subject("History", new Mark(4), new Date(24, 02, 2022))).collect(Collectors.toList())),
//                        new Student("Hamaiunov Oleksandr Andriyovych", Stream.of(
//                                new Subject("Higher Mathematics", new Mark(5), new Date(24, 02, 2022)),
//                                new Subject("Algorithmization", new Mark(5), new Date(24, 02, 2022)),
//                                new Subject("History", new Mark(5), new Date(24, 02, 2022))).collect(Collectors.toList())))
//                                .collect(Collectors.toList()), Stream.of(
//                        new TypesOfSubject("Higher Mathematics"),
//                        new TypesOfSubject("Algorithmization"),
//                        new TypesOfSubject("History")
//                ).collect(Collectors.toList()), "IT-22")).collect(Collectors.toList()));
//
//        System.out.println(Lviv_Polytechnic);
//    }
//}