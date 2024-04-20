package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        //when
        Student student = new Student(0, null);
        //then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void TestInheritance() {
        //when
        Student student = new Student(0, null);
        //then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        //given
        Student student = new Student(0, null);
        //when
        student.learn(12.0);
        double expected = 12.0;
        //then
        Assert.assertEquals(expected,12, 00.1);



        //when

    }
}
