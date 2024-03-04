package org.Ncc.Feb.B29.e1;

public class Dog extends Animal{
    String name;

    Dog(String speice, String name) {
        super(speice);
        this.name=name;
    }

    @Override
    String ani() {
        return getSpeice() + " " + this.name;
    }
}
