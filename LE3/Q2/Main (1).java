/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
interface Testable {
    void display();
}
class Test implements Testable {
    @Override
    public void display() { 
        System.out.println("Display method in Test class.");
    }
}

abstract class AbsTest implements Testable {
}
class FinalTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("Display method in FinalTest class.");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Test class ---");
        Test obj1 = new Test();
        obj1.display();
        System.out.println("--- Testing FinalTest class ---");
        FinalTest obj2 = new FinalTest();
        obj2.display();
    }
}
