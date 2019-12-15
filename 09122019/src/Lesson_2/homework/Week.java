package Lesson_2.homework;

public enum Week {
    MONDAY(40,"Today is monday. 40 hours left to work"), TUESDAY(32,"Today is tuesday. 32 hours left to work"),
    WEDNESDAY(24,"Today is wednesday. 24 hours left to work"),THURSDAY(16,"Today is thursday. 16 hours left to work"),
    FRIDAY(8,"Today is friday. 8 hours left to work"),SATURDAY(0,"Today is not a working day!"),
    SUNDAY(0, "Today is not a working day!");

    private int Hours;
    private String Message;

    public int getHours() {
        return Hours;
    }

    public String getMessage() {
        return Message;
    }

    Week(int Hours, String Message){
        this.Hours=Hours;
        this.Message=Message;

    }


    public static String dayOfWeek(Week day){
        return day.Message;
    }
    public static void main(String[] args){
        Week m=Week.MONDAY;
        System.out.println(dayOfWeek(m));

        Week tu=Week.TUESDAY;
        System.out.println(dayOfWeek(tu));

        Week we=Week.WEDNESDAY;
        System.out.println(dayOfWeek(we));

        Week th=Week.THURSDAY;
        System.out.println(dayOfWeek(th));

        Week f=Week.FRIDAY;
        System.out.println(dayOfWeek(f));

        Week sat=Week.SATURDAY;
        System.out.println(dayOfWeek(sat));

        Week sun=Week.SUNDAY;
        System.out.println(dayOfWeek(sun));

    }
}
