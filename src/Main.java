import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        List<Person> clients = generateClients();
        for (Person client : clients) {
            if (client.getTicketsAmount() > 0)
                queue.offer(client);
        }
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            person.setTicketsAmount(person.getTicketsAmount() - 1);
            System.out.println("Клиент " + person.getName() + " " + person.getSurName() + " прокатился на аттракционе!");
            System.out.println("Осталось билетов: " + person.getTicketsAmount());
            if (person.getTicketsAmount() != 0) {
                queue.offer(person);
            }
            System.out.println();
        }
    }

    public static List<Person> generateClients() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Алексей", "Смирнов", 8));
        list.add(new Person("Максим", "Давыдов", 2));
        list.add(new Person("Ольга", "Попова", 5));
        list.add(new Person("Виктория", "Сидорова", 3));
        list.add(new Person("Олеся", "Биляева", 1));
        return list;
    }
}