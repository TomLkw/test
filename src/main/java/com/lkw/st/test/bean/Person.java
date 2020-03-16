package com.lkw.st.test.bean;

public class Person {

    private int id;
    private String name;
    private int isDelete;

    public Person(int id, String name, int isDelete) {
        this.id = id;
        this.name = name;
        this.isDelete = isDelete;
    }

    public Person() {
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

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
