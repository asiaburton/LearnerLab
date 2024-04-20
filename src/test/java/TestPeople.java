import io.zipcoder.interfaces.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    @Test
    public void testAdd() {
        Person person = new Person(8, "Kim");
        List<Person> personList = new ArrayList<>();

        personList.add(person);
        Assert.assertEquals(person, personList.get(0));
    }

    @Test
    public void testRemove() {
        Person person = new Person(9, "Karl");
        List<Person> personList = new ArrayList<>();

        personList.remove(person);
        Assert.assertEquals(-1, personList.indexOf(person));
    }

    @Test
    public void testFindById() {
        Person person = new Person(10, "Kate");

        person.findById();
        Assert.assertEquals(10, person.getId());
    }

}
