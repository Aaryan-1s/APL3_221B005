class Test implements Testable {
    @Override
    public void display() {
        System.out.println("Test class implementing Testable interface.");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}
