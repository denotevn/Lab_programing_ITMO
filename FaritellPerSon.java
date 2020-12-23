package Prack04;
import java.io.*;

public class FaritellPerSon implements PerSon {
    private String name;
    protected FaritellPerSon(String Name)
    {
        this.name = Name;
    }
    @Override
    public void OutPut(String move) {

        System.out.printf(move);
    }
    public static boolean isNumeric(String name){
        try{
            Double.parseDouble(name);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    @Override
    public String getName() {
        if(name == null) throw new NullPointerException();
        if(isNumeric(name)==true) throw new NumberFormatException();
        return name;
    }


}
