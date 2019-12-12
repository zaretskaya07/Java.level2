package Lesson_1.Marathon;

import Lesson_1.Marathon.Competitor.Competitor;
import Lesson_1.Marathon.Obstacle.Cross;
import Lesson_1.Marathon.Obstacle.Wall;
import Lesson_1.Marathon.Obstacle.Water;

public class Course  {
    Water water;
    Wall wall;
    Cross cross;

    public Course(int swimDistance, int height, int km){
        this.water= new Water(swimDistance);
        this.wall=new Wall(height);
        this.cross=new Cross(km);
    }

    public boolean run(Competitor member){
        this.wall.doIt(member);
        if (checkOnDistance(member)) {
            this.water.doIt(member);
            if (checkOnDistance(member)){
                this.cross.doIt(member);
                if (checkOnDistance(member))
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
        else
            return false;
    }

    private boolean checkOnDistance(Competitor member){
        if (member.isOnDistance())
            return true;
        else
            return false;
    }



}
