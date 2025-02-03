/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
abstract class Bharatvanshi {
    abstract void fight(); 
}
abstract class Pandav extends Bharatvanshi {
    void obey() {
        System.out.println(getClass().getSimpleName() + " is obedient.");
    }

    abstract void kind(); 
}
class Arjun extends Pandav {
    @Override
    void fight() {
        System.out.println("Arjun is a great warrior with archery skills.");
    }

    @Override
    void kind() {
        System.out.println("Arjun is kind-hearted.");
    }
}
class Bheem extends Pandav {
    @Override
    void fight() {
        System.out.println("Bheem is a great warrior with immense strength.");
    }

    @Override
    void kind() {
        System.out.println("Bheem is kind but a little less than Arjun.");
    }
}
abstract class Kaurav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println(getClass().getSimpleName() + " is a fighter.");
    }

    void obey() {
        System.out.println(getClass().getSimpleName() + " is disobedient.");
    }

    void kind() {
        System.out.println(getClass().getSimpleName() + " is cruel.");
    }
}
class Duryodhan extends Kaurav {
}

class Vikarn extends Kaurav {
    @Override
    void obey() {
        System.out.println("Vikarn is obedient.");
    }

    @Override
    void kind() {
        System.out.println("Vikarn is kind-hearted.");
    }
}
public class Mahabharat {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        System.out.println("\n--- Pandavs ---");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("\n--- Kauravs ---");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
