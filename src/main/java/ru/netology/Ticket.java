package ru.netology;

public class Ticket implements Comparable<Ticket> {
    protected int id;
    protected int cost;
    protected int timeMin;
    protected String from;
    protected String to;

    public Ticket(int id, int cost, int timeMin, String from, String to) {
        this.id = id;
        this.cost = cost;
        this.timeMin = timeMin;
        this.from = from;
        this.to = to;
    }

    public int getId() {
        return id;
    }


    public int getCost() {
        return cost;
    }


    public int getTimeMin() {
        return timeMin;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }


    @Override
    public int compareTo(Ticket o) {
        if (cost < o.getCost()) {
            return -1;
        } else if (cost > o.getCost()) {
            return 1;
        } else
            return 0;
    }
}

