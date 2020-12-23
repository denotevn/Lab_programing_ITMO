package Prack04;

public enum Thing {
    Capogi("сапог,"," космический "),
    Capogi2(" сапожок Пончика."," второй космический"),
    rope("Веревка"," "),rope2("веревкой,",""),
    Plag("флагом."," "),
    head("головой"," только ");
    private String nameThing;
    private String Charateristics;
    Thing(String name,String charaterisctics)
    {
        this.nameThing = name;
        this.Charateristics = charaterisctics;
    }

    @Override
    public String toString() {
        return Charateristics + nameThing;
    }
}
