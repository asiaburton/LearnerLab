package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testPersonConstructor() {
        //given
        Long expectedId = Long.MAX_VALUE;
        String expectedName = "PersonName";
        Person person = new Person(expectedId, expectedName);
        //when
        Long actualId = person.getId();
        String actualName = person.getName();
        //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        //given
        Person person = new Person();
        String expected = "PersonName";
        //when
        person.setName(expected);
        String actual = person.getName();
        //then
        Assert.assertEquals(expected,actual);

    }
}
