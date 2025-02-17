class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("RedHead Duck flies high!");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck quacks!");
    }
}
