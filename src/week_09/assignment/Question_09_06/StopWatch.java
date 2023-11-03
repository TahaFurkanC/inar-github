package week_09.assignment.Question_09_06;

public class StopWatch {
    //        ---------------------
//            |    StopWatch      |
//            ---------------------
//            | -startTime: long     |
//            | -endTime: long    |
//            ---------------------
//            | + StopWatch()       |
//            | + getStartTime(): long   |
//            | + getEndTime(): long |
//            | + start(): void |
    //        | + stop(): void  |
    //        | + getElapsedTime(): long |
//            ---------------------

    private long startTime;
    private long endTime;
    StopWatch(){
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
