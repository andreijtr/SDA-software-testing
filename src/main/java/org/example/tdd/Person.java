package org.example.tdd;

public class Person {

    private static final int TEENAGER_DOWN_LIMIT = 10;
    private static final int TEENAGER_UP_LIMIT = 20;

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public Boolean isTeenager() {
        return this.age > TEENAGER_DOWN_LIMIT && this.age < TEENAGER_UP_LIMIT;
    }
}
