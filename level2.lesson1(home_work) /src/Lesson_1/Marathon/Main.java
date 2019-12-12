package Lesson_1.Marathon;

public class Main {
    public static void main(String[] args) {
//        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
//        Obstacle[] course = {new Cross(80), new Wall(2), new Water(50), new Cross(120)};
//        for (Competitor c : competitors) {
//            for (Obstacle o : course) {
//                o.doIt(c);
//                if (!c.isOnDistance()) break;
//            }
//        }
//        for (Competitor c : competitors) {
//            c.info();
        Course c=new Course(100,3,10);
        Team team1= new Team("Billy","Marty","Silver","Alex");
        team1.run(c);
        team1.getInfoAboutMembersWhoFinished();
        team1.getInfoAboutMembers();

        }
    }


