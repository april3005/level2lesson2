public class Circle extends Figure implements Drawable {
    private int radius;
    private double pi;

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public Circle(int radius, double pi) {
        this.radius = radius;
        this.pi = pi;
    }

    public String getInfo(){
        return "circle";
    }
    public double getPerimeter (){
        return 2*Math.PI*radius;
    }

    @Override
    public String draw() {
        return "\u25CF";
    }
}
