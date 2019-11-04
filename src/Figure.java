abstract public class Figure {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo (){
      return "";
    }

    public double getPerimeter (){
        return 0.0;
    }

    abstract public String draw ();

}
