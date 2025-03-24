class Whisky {
    public void templateMethod() {
        pour();
        addCondiment();
        stir();
        serve();
    }

    private void pour() {
        System.out.println("Pour 30 ml of whisky");
    }

    private void addCondiment() {
        System.out.println("Add some soda");
    }

    private void stir() {
        System.out.println("Stir for 30 sec");
    }

    private void serve() {
        System.out.println("Serve appropriately");
    }
}