package Task2;

import java.time.LocalDate;

public class Subject {
    private String name;
    private LocalDate date;

    public Subject(final String name, final LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(final LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name=" + name +
                ", date=" + date +
                '}' + "\n";
    }
}