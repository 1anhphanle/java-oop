package huongdoituong.Bai13;

public class Time implements Comparable<Time> {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public int compareTo(Time other) {
        if (this.hours != other.hours) {
            return this.hours - other.hours;
        } else if (this.minutes != other.minutes) {
            return this.minutes - other.minutes;
        } else {
            return this.seconds - other.seconds;
        }
    }

    @Override
    public String toString() {
        return hours + " " + minutes + " " + seconds;
    }
}
