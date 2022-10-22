public class Person {
    private String name;
    private String surName;
    private int ticketsAmount;

    public Person(String name, String surName, int ticketsAmount) {
        this.name = name;
        this.surName = surName;
        this.ticketsAmount = ticketsAmount;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getTicketsAmount() {
        return ticketsAmount;
    }

    public void setTicketsAmount(int ticketsAmount) {
        this.ticketsAmount = ticketsAmount;
    }
}