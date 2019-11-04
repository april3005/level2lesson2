public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10, 3.14);
        System.out.println(circle.getInfo() + " " + circle.getPerimeter());

        Triangle triangle = new Triangle(5, 5, 5);
        System.out.println(triangle.getInfo() + " " + triangle.getPerimeter());

        Square square = new Square(8);
        System.out.println(square.getInfo() + " " + square.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 8);
        System.out.println(rectangle.getInfo() + " " + rectangle.getPerimeter());

        Figure figure[] = new Figure [6];
        figure [0] = circle;
        figure [1] = triangle;
        figure [2] = square;
        figure [3] = rectangle;
        figure [4] = new Triangle (2, 2, 2);
        figure [5] = new Square (3);

        for (int i = 0; i <figure.length ; i++) {
            System.out.println(figure[i].getInfo() + " " + figure[i].draw() + " " + figure[i].getPerimeter());
        }

        Dog dog = new Dog ("Max");
        System.out.println(dog.getName() + " " + dog.draw() + dog.callSound());


    }
}
