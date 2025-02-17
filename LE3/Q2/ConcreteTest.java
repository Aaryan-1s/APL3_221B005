class ConcreteTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("ConcreteTest class extending AbsTest and implementing display().");
    }

    public static void main(String[] args) {
        ConcreteTest ct = new ConcreteTest();
        ct.display();
    }
}
