package Lesson_1.Marathon;

import Lesson_1.Marathon.Competitor.Cat;
import Lesson_1.Marathon.Competitor.Competitor;
import Lesson_1.Marathon.Competitor.Dog;
import Lesson_1.Marathon.Competitor.Human;

public class Team {
    String Name;
    Competitor[] teamMembers= new Competitor[4];

    public Team(String firsttMember,String secondMember, String thirdMember, String fourthMember){
        this.teamMembers[0]= new Human(firsttMember);
        this.teamMembers[1]= new Human(secondMember);
        this.teamMembers[2]= new Dog(thirdMember);
        this.teamMembers[3]= new Cat(fourthMember);
        }

    //выводит информацию о членах команды, которые успешно прошли всю дистанцию
    public void getInfoAboutMembersWhoFinished(){
        for (Competitor m: teamMembers) {
            if (m.isOnDistance()){
                System.out.println(m.getName() +" успешно прошел дистанцию!");
            }
        }
    }

    //выводит статус всех участников команды
    public void getInfoAboutMembers(){
        for (Competitor m: teamMembers) {
            m.info();
        }
    }

    public void run(Course course){
        for (Competitor c: teamMembers) {
            course.run(c);
        }
    }
}

