public class Main {
    public static void main(String[] args) {
        Whisky whisky = new Whisky();
        Rum rum = new Rum();
        Beer beer = new Beer();
        Wine wine = new Wine();
        Vodka vodka = new Vodka();

        System.out.println("Preparing Whisky:");
        whisky.templateMethod();

        System.out.println("\nPreparing Rum:");
        rum.templateMethod();

        System.out.println("\nPreparing Beer:");
        beer.templateMethod();

        System.out.println("\nPreparing Wine:");
        wine.templateMethod();

        System.out.println("\nPreparing Vodka:");
        vodka.templateMethod();
    }
}