public class TaskTest {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Abacki", 34);
        Person person2 = new Person("Janina", "Babacka", 27);
        Person person3 = new Person("Marek", "Cabacki", 31);

        Task task1 = new Task("śmieci", "segregowanie śmieci");
        Task task2 = new Task("odkurzanie", "odkurzanie mieszkania raz w tygodniu", 1);
        Task task3 = new Task("jedzenie", "kupowanie jedzenia 3 razy w tygodniu", 0, person2);
        Task task4 = new Task("ubrania", "kupwoanie ubrań raz w miesiącu", -1, person2);
        Task task5 = new Task("rozrywka", "wyjście do kina raz w tygodniu", -1, person1);
        System.out.println(task1.toString());
        System.out.println(task2.toString());
        System.out.println(task3.toString());
        System.out.println(task4.toString());
        System.out.println(task5.toString());
        System.out.println("Zadanie 1 - " + task1.getPriority());
        System.out.println("Zadanie 2 - " + task2.getPriority());
        System.out.println("Zadanie 3 - " + task3.getPriority());
        System.out.println("Zadanie 4 - " + task4.getPriority());
        System.out.println("Zadanie 5 - " + task5.getPriority());
    }
}
