package Task3.service;

import Task2.University;

import java.time.LocalDate;

public class AddDate extends Service {
    public AddDate(final University university) {
        super(university);
    }

    public void addDate(final String nameGroup, final String nameSubject, final LocalDate date) {
        getSubjectsByName(nameGroup, nameSubject).setDate(date);
    }
}
