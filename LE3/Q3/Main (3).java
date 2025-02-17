public class Main {
    public static void main(String[] args) {
        RubberDuck rd = new RubberDuck();
        System.out.println("Rubber Duck:");
        rd.swim();
        rd.quack();
        
        System.out.println("\nWooden Duck:");
        WoodenDuck wd = new WoodenDuck();
        wd.swim();
        System.out.println("Wooden Duck is mute.");

        System.out.println("\nRedHead Duck:");
        RedHeadDuck rhd = new RedHeadDuck();
        rhd.swim();
        rhd.fly();
        rhd.quack();

        System.out.println("\nLake Duck:");
        LakeDuck ld = new LakeDuck();
        ld.swim();
        ld.fly();
        ld.quack();
    }
}
