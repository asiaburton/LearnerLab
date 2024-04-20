package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testPersonConstructor() {
        //given
        Person person = new Person(3, "Jim");

        long actualId = 3;
        String actualName = "Jim";

        //when
        long expectedId = person.getId();
        String expectedName = person.getName();
        //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        //given
        Person person = new Person(0, "Asia");
        String expected = "PersonName";
        //when
        person.setName(expected);
        String actual = person.getName();
        //then
        Assert.assertEquals(expected,actual);

    }
}
