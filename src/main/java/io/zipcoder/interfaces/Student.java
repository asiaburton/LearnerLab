package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    public Student() {

    }


    @Override
    public void learn(double numberOfHours) {

    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
