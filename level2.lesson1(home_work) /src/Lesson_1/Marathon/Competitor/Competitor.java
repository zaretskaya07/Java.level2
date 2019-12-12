package Lesson_1.Marathon.Competitor;

public interface Competitor {
    void run(int dist);
    void swim(int dist);
    void jump(int height);
    String getName();
    boolean isOnDistance();
    void info();
}
