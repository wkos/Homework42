public class Task {
    String name;
    String description;
    Integer priority;
    Person responsiblePerson;

    Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    Task(String name, String description, Integer priority) {
        this(name, description);
        this.priority = priority;
    }

    Task(String name, String description, Integer priority, Person responsiblePerson) {
        this(name, description, priority);
        this.responsiblePerson = responsiblePerson;
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
