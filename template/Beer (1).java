class Beer {
    public void templateMethod() {
        pour();
        addCondiment();
        stir();
        serve();
    }

    private void pour() {
        System.out.println("Pour 500 ml of beer");
    }

    private void addCondiment() {
        System.out.println("Add a slice of lemon");
    }

    private void stir() {
        System.out.println("Stir gently");
    }

    private void serve() {
        System.out.println("Serve chilled");
    }
}