public class Time{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour <0 || hour >23 ||
                minute <0 || minute >59 ||
                second <0 || second >59) {
            throw new IllegalArgumentException("Invalid time provided");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int standardHour = (hour ==0 || hour ==12) ?12 : hour %12;
        String period = hour <12 ? "AM" : "PM";
        return String.format("%02d:%02d:%02d%s", standardHour, minute, second, period);
    }

    public Time add(Time other) {
        return add(this, other);
    }

    public static Time add(Time a, Time b) {
        int totalSeconds = a.second + b.second;
        int carryMinutes = totalSeconds /60;
        int seconds = totalSeconds %60;

        int totalMinutes = a.minute + b.minute + carryMinutes;
        int carryHours = totalMinutes /60;
        int minutes = totalMinutes %60;

        int hours = (a.hour + b.hour + carryHours) %24;

        return new Time(hours, minutes, seconds);
    }
}