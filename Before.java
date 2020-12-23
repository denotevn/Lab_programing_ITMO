package Prack04;

public class Before implements Status{
    @Override
    public String getStatus(String status, String action) {
        return status + action;
    }
}
