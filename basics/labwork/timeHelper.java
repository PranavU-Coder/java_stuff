package pranav_ecm_b;

import java.time.*;

public class timeHelper {
    int hour;
    int min;
    int sec;

    public timeHelper() {
        LocalTime time = LocalTime.now();
        this.hour = time.getHour();
        this.min = time.getMinute();
        this.sec = time.getSecond();
    }

    public timeHelper(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    void returnTime() {
        System.out.println(hour + " : " + min + " : " + sec);
    }

    public timeHelper addTime(timeHelper other) {
        LocalTime t1 = LocalTime.of(this.hour, this.min, this.sec);
        LocalTime t2 = LocalTime.of(other.hour, other.min, other.sec);
        LocalTime result = t1.plusHours(t2.getHour())
                             .plusMinutes(t2.getMinute())
                             .plusSeconds(t2.getSecond());

        timeHelper added = new timeHelper(result.getHour(), result.getMinute(), result.getSecond());
        added.returnTime(); 
        return added;
    }

    public timeHelper subtractTime(timeHelper other) {
        LocalTime t1 = LocalTime.of(this.hour, this.min, this.sec);
        LocalTime t2 = LocalTime.of(other.hour, other.min, other.sec);

        LocalTime result = t1.minusHours(t2.getHour())
                             .minusMinutes(t2.getMinute())
                             .minusSeconds(t2.getSecond());

        timeHelper subtracted = new timeHelper(result.getHour(), result.getMinute(), result.getSecond());
        subtracted.returnTime(); 
        return subtracted;
    }
    
    public void compareTime(timeHelper other) {
        LocalTime t1 = LocalTime.of(this.hour, this.min, this.sec);
        LocalTime t2 = LocalTime.of(other.hour, other.min, other.sec);

        int comparison = t1.compareTo(t2);

        if (comparison > 0) {
            System.out.println("First time is greater");
        } else if (comparison < 0) {
            System.out.println("Second time is greater");
        } else {
            System.out.println("Both times are equal");
        }
    }
}
