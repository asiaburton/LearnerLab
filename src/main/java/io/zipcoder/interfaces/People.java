package io.zipcoder.interfaces;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {

    List<Person> personList = new ArrayList<>();

    public void add(Person person) {
      personList.add(person);
    }

    public Person findById(long id) {
        for(Person person : personList) {
           if (person.getId() == id) {
               return person;
           }
        }
        return null;
    }

    public boolean contains(Person person) {
        for (Person p : personList) {
            if(p.equals(person)) {
                return true;
            }
        }
        return false;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void removeById(long id) {
        for(Person person : personList) {
            if(person.getId() == id) {
                personList.remove(person);
            }
        }
    }

    public void removeAll(ArrayList<Person> list) {
        list.removeAll(personList);
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
       return personList.toArray(new Person[0]);

    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
