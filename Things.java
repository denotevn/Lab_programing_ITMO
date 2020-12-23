package Prack04;

public class Things {
    private String nameThings;

    protected Things(String nameThings) {
        this.nameThings = nameThings;
    }
    public class Properties{
        private String properties;
        public void setProperties(String properties) {
            this.properties = properties;
        }
        public String outputthing()
        {
            return properties + nameThings;
        }
    }
    @Override
    public String toString() {return nameThings;}
}
