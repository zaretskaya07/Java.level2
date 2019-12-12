package Lesson_1.Marathon.Obstacle;

import Lesson_1.Marathon.Competitor.Competitor;
import Lesson_1.Marathon.Obstacle.Obstacle;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}