public class Square extends Figure implements Drawable{
    int a; // P=4s

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Square(int a) {
        this.a = a;
    }

    public String getInfo (){
        return "Square";
    }

    public double getPerimeter (){
        return 4*a;
    }

    @Override
    public String draw() {
        return "\u25A0";
    }
}
