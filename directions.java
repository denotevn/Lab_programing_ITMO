package Prack04;

public enum directions {
    вверх(" вверх"),
    вперед(" вперед"),
    подуклон(" под уклон,"),
    kwhom(" к нему."),
    down(" вниз");
    private String direction;
    directions(String direc)
    {
        this.direction = direc;
    }

    @Override
    public String toString() {
        return direction;
    }
}
