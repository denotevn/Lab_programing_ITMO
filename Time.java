package Prack04;

public enum Time {
    Time1(" Как раз в это время "),
    Time2("Это было сделано вовремя."),
    Time3(" сейчас же ");
    private String time;
    Time(String Time)
    {
        time = Time;
    }

    @Override
    public String toString() {
        return time ;
    }
}
