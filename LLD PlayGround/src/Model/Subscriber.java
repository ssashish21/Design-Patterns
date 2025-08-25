package Model;

import Notifcation.Chanel;

import java.util.List;

public class Subscriber {
    private int id;
    private String name;
    private List<Chanel> chanels;

    public Subscriber(int id, String name, List<Chanel> chanels) {
        this.id = id;
        this.name = name;
        this.chanels = chanels;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChanels(List<Chanel> chanels) {
        this.chanels = chanels;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Chanel> getChanels() {
        return chanels;
    }

}
