package org.Ncc.Mar.t08.arrayListReview;

import java.util.Objects;

public class Person {
    private String name;
    private int id;

    Person(String name, int id){this.name = name; this.id = id;}

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setId(int id) {this.id = id;}
    public int getId() {return id;}

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        if(person.getId() == this.id && person.getName().equals(this.name)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
