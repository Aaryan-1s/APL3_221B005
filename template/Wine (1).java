class Wine {
    public void templateMethod() {
        pour();
        addCondiment();
        stir();
        serve();
    }

    private void pour() {
        System.out.println("Pour 150 ml of wine");
    }

    private void addCondiment() {
        System.out.println("Add some berries");
    }

    private void stir() {
        System.out.println("Do not stir");
    }

    private void serve() {
        System.out.println("Serve at room temperature");
    }
}