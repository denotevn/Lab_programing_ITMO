package Prack04;

public class ActionNotMove extends Action{
    public String take(String place)
    {
        return " взяв "+ place +" Клепку.";
    }
    public String throww (String name, String when)
    {
        return "который "+ name + " сбросил с ноги "+ when;
    }
    public String ycpex(String place)
    {
        return "они достигли "+ place;
    }
    public String understand(String name)
    {
        return name+ " понял, "  ;
    }
    public String Continue()
    {
        return " и продолжал кувыркаться.";
    }
    public String Znaykaaction(String name,String thing,String name2)
    {
        return name+ " велел путешественникам связаться "+
                thing + " как это делают "+name2+ " \nпереходя через ледники.";
    }
    public String Result(String name1,String what) throws bootsFoundExxeption {
        if(name1!="Тюбику") throw new bootsFoundExxeption();
        return  name1 + " удалось обнаружить в"+what;
    }

    public String hastened(String name, String direction )
    {
        return name+ " поспешили "+ direction;
    }
    public String notunderstand(String name,String what)
    {
        return name + " даже не сразу понял "+ what;
    }
    public String actThing(String nameThing)
    {
        return nameThing+ " тотчас натянулась и потащила за собой  остальных путешественников.";
    }

    public String Search() {
        return " решили его тщательно обыскать.";
    }
    public String Noticing(String thing,String direction)
    {
        return "Заметив,что "+ thing +" тоннеля шло "+ direction;
    }
    public String ActionGenaral(String action)
    {
        return action ;
    }


}
