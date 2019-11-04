public class Dog extends Animal implements Drawable, SoundProducable {


    public Dog(String name) {
        super(name);
    }

    @Override
    public String draw() {
        return "\uD83D\uDC36";
    }

    @Override
    public String callSound() {
        return "Woof-woof";
    }
}
