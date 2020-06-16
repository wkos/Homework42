public class Task {
    String name;
    String description;
    Integer priority;
    Person responsiblePerson;

    public Task(String name, String description, Integer priority, Person responsiblePerson) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.responsiblePerson = responsiblePerson;
    }

    public Task(String name, String description, Integer priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    boolean highPriority() {
        return priority > 0;
    }

    boolean mediumPriority() {
        return priority == 0;
    }

    boolean lowPriority() {
        return priority < 0;
    }

    String getPriority() {
        if (priority != null) return "priorytet: " + priority;
        else return "priorytet: nie ustawiony";
    }

    @Override
    public String toString() {
        if (responsiblePerson == null)
            if (priority == null)
                return "Task{" + "name='" + name + '\'' + ", description='" + description + '\'' + '}';
            else
                return "Task{" + "name='" + name + '\'' + ", description='" + description + '\'' +
                        ", priority=" + priority + '}';
        else
            return "Task{" + "name='" + name + '\'' + ", description='" + description + '\'' +
                    ", priority=" + priority + ", responsiblePerson=" + responsiblePerson.firstName +
                    " " + responsiblePerson.lastName + '}';
    }
}
