import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Person;

public class Instructor extends Person implements Teacher {
    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        for(Learner learner : learners) {
            learner.learn(numberOfHours);

        }
    }
}
