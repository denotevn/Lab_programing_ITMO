package Prack04;

public class ActionMove extends Action {

    public String gave(String name,String Place)
    {
        return name + " отдал ему приказ"+ " вернуться "+Place;
    }
    public String look1(String name, String what)
    {
        return name+ "увидев "+ what;
    }
    public String make(String name,String what)
    {
        return name + "совершил"+ what;
    }
    public String notAttention(String name,String what)
    {
        return name+" не обратил никакого внимания на "+ what;
    }
    public String look2(String name,String place)
    {
        return name+ " увидел " + place;
    }
    public String pick(String name,String what)
    {
        return name + what+ " поднял ";
    }
    public String pick1(String directions){return "поднял " + directions;}
    public String run1(String name,String direction){
        return name+ " подбежали "+ direction;
    }
    public String shook(String name, String what){
        return name + "только" + what+ " покачал, глядя на  на это дурачество.";
    }
    public String wawe(){
        return "размахивая словно ";
    }
    public String disperse(String Place )
    {
        return "Все разбрелись среди "+ Place;
    }
    public String actHiuMan(String name,String place)
    {
        return name+" двинулись дальше и скоро очутились "+ place ;
    }
    public String slipped(String name, String place1,String direction)
    {
        return name + " поскользнулся " + place1 + " упав на спину, "+ " покатился " + direction;
    }
    public String actGeneral(){
        return " прикрепить к поясам веревку и двинуться в путь,";
    }
    public String run(){return " бежал из пещеры ";}
    public String Snatch(String name,String what){
        return name+ " выхватил у Знайки "+ what;
    }
    public String fasten(String place){
        return" нацепил его "+ place;
    }


}
