package io.zipcoder.interfaces;

public class Person {
//instance variables
    final Long id;
    String name;



    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
        this.id = Long.MAX_VALUE;
        this.name = "";
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
