class Vodka {
    public void templateMethod() {
        pour();
        addCondiment();
        stir();
        serve();
    }

    private void pour() {
        System.out.println("Pour 30 ml of vodka");
    }

    private void addCondiment() {
        System.out.println("Add cranberry juice");
    }

    private void stir() {
        System.out.println("Stir for 15 sec");
    }

    private void serve() {
        System.out.println("Serve on the rocks");
    }
}
