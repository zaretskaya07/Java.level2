package Lesson_1.Marathon.Obstacle;

import Lesson_1.Marathon.Competitor.Competitor;
import Lesson_1.Marathon.Obstacle.Obstacle;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}