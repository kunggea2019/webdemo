package com.example.webdemo.bean;

public class Dog {

    private int id;
    private String name;
    private String desp;

    public Dog(int id, String name, String desp) {
        this.id = id;
        this.name = name;
        this.desp = desp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desp='" + desp + '\'' +
                '}';
    }
}
