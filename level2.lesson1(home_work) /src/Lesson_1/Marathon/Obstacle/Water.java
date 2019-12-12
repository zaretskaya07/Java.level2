package Lesson_1.Marathon.Obstacle;

import Lesson_1.Marathon.Competitor.Competitor;
import Lesson_1.Marathon.Obstacle.Obstacle;

public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}