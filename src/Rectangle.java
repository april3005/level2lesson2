public class Rectangle extends Figure implements Drawable{
    //2(a+b)
    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getInfo (){
        return "Rectangle";
    }

    public double getPerimeter (){
        return 2 *(a + b);
    }

    @Override
    public String draw() {
        return "\u25AE";
    }
}
