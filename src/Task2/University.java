package Task2;

import java.util.List;

public class University {
    private List<Group> groups;

    public List<Group> getGroups() {
        return groups;
    }

    public void setStudents(final List<Group> groups) {
        this.groups = groups;
    }

    public University(final List<Group> groups) {
        this.groups = groups;
    }

    public String toString() {
        final StringBuilder universityGroups = new StringBuilder();
        for (final var group : groups) {
            universityGroups.append(group).append('\n');
        }
        return "University: " +
                "Group =\n" + universityGroups;
    }
}
