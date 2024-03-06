package org.Ncc.Mar.t05.abstractEx;

class Person {
    String name,id;
    Person(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
