public class Triangle extends Figure implements Drawable{
    private int a; //P = a+b+c
    private int b;
    private int c;

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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getInfo (){
        return "Triangle";
    }

    public double getPerimeter (){
        return a + b + c;
    }

    @Override
    public String draw() {
        return "\u25B2";
    }
}
