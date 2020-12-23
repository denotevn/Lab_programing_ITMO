package Prack04;

public class When implements Status{

    @Override
    public String getStatus(String status,String action) {
        return "когда" + action ;
    }
}
