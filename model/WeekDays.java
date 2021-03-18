package model;

public enum WeekDays {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String title;

     WeekDays(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
