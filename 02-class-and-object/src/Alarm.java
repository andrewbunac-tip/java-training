import java.sql.Time;

public class Alarm {

    Time alarmTime;
    boolean alarmMode;


    void setAlarmTime(Time time) {
        this.alarmTime = time;
        alarmMode = true;
    }

    Time getAlarmTime() {
        return alarmTime;
    }

    boolean isAlarmSet() {
        return alarmMode;
    }

    void snooze() {

    }

}
