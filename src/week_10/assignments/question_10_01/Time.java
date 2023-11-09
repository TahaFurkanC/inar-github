package week_10.assignments.question_10_01;

public class Time {
//            --------------------------------
//            |            Time              |
//            --------------------------------
//            | - hour: int                  |
//            | - minute: int                |
//            | - second: int                |
//            --------------------------------
//            | + Time()                     |
//            | + Time(elapseTime: long)     |
//            | + Time(hour: int, minute: int,|
//            |    second: int)              |
//            | + getHour(): int             |
//            | + getMinute(): int           |
//            | + getSecond(): int           |
//            | + setTime(elapseTime: long)  |
//            --------------------------------
    private int hour;
    private int minute;
    private int second;
    public Time(){
        long totalMilliSeconds = System.currentTimeMillis();
        setTime(totalMilliSeconds);
    }
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time(long elapsedTime){
        setTime(elapsedTime);
    }
    public int getHour(){
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public void setTime(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        this.second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        this.hour = (int)(totalHours % 24);
    }
}
