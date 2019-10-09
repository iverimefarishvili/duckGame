import services.Duck;
import services.species.MallardDuck;
import services.species.OtherDucks;
import services.species.RedHeadDuck;

public class Main {
    public static void main(String[] args) {
        Duck d = new MallardDuck();
        d.display();
        d.swim();
        d.quack();
        d.fly();

        Duck a = new RedHeadDuck();
        a.display();
        a.swim();
        a.quack();
        a.fly();

        Duck b = new OtherDucks();
        b.display();
        b.swim();
        b.quack();
        b.fly();

    }
}
