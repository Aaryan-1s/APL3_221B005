class Rum {
    public void templateMethod() {
        pour();
        addCondiment();
        stir();
        serve();
    }

    private void pour() {
        System.out.println("Pour 30 ml of rum");
    }

    private void addCondiment() {
        System.out.println("Add some coke");
    }

    private void stir() {
        System.out.println("Stir for 20 sec");
    }

    private void serve() {
        System.out.println("Serve with lime");
    }
}

