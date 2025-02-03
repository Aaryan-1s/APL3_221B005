/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
interface SwimBehavior {
    default void swim() {
        System.out.println("All ducks can swim.");
    }
}
interface FlyBehavior {
    void fly();
}
interface QuackBehavior {
    void quack();
}
class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I can fly with my wings.");
    }
}

class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly.");
    }
}
class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak! Squeak!");
    }
}

class Mute implements QuackBehavior {
    public void quack() {
        System.out.println("...");
    }
}
abstract class Duck implements SwimBehavior {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    abstract void display();
}
class RubberDuck extends Duck {
    RubberDuck() {
        super(new NoFly(), new Squeak()); 
    }

    void display() {
        System.out.println("I'm a Rubber Duck.");
    }
}

class WoodenDuck extends Duck {
    WoodenDuck() {
        super(new NoFly(), new Mute()); 
    }

    void display() {
        System.out.println("I'm a Wooden Duck.");
    }
}

class RedHeadDuck extends Duck {
    RedHeadDuck() {
        super(new FlyWithWings(), new Quack()); 
    }

    void display() {
        System.out.println("I'm a RedHead Duck.");
    }
}

class LakeDuck extends Duck {
    LakeDuck() {
        super(new FlyWithWings(), new Quack()); 
    }

    void display() {
        System.out.println("I'm a Lake Duck.");
    }
}
public class DuckGame {
    public static void main(String[] args) {
        Duck rd = new RubberDuck();
        Duck wd = new WoodenDuck();
        Duck rhd = new RedHeadDuck();
        Duck ld = new LakeDuck();

        System.out.println("\n--- Duck Show ---");
        rd.display();
        rd.swim();
        rd.performFly();
        rd.performQuack();

        System.out.println("\n---");
        wd.display();
        wd.swim();
        wd.performFly();
        wd.performQuack();

        System.out.println("\n---");
        rhd.display();
        rhd.swim();
        rhd.performFly();
        rhd.performQuack();

        System.out.println("\n---");
        ld.display();
        ld.swim();
        ld.performFly();
        ld.performQuack();
    }
}
