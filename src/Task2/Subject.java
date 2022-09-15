package Task2;

import java.util.List;
import java.util.Map;

public class Subject {
    private String name;
    private Mark mark;
    private Date date;

    public Subject(final String name, final Mark mark, final Date date) {
        this.name = name;
        this.mark = mark;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(final Mark mark) {
        this.mark = mark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name=" + name +
                "--" + mark +
                ", date=" + date +
                '}' + "\n";
    }
}