import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Person;
import io.zipcoder.interfaces.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(0, null);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(0, null);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        //given
        Instructor instructor = new Instructor(0, null);
        Learner[] learner = new Learner[1];
        //when
        learner[0] = new Student(2, "Kayla");
        instructor.teach(learner[0], 12.0);
        //then
        double actual = learner[0].getTotalStudyTime();

        Assert.assertEquals(12.0, actual, 0.1);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(0, null);
        Learner[] learners = new Learner[2];
        learners[0] = new Student(3, "James");
        learners[1] = new Student(4, "Gail");

        instructor.lecture(learners, 30.0);

        Assert.assertEquals(15.0, learners[0].getTotalStudyTime(), 0.1);
    }
}
