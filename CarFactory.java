public class CarFactory {

    private static CarFactory instance;

    private int totalCarsProduced;

    // Private constructor
    private CarFactory() {
        this.totalCarsProduced = 0;
        System.out.println("Car Factory initialized");
    }

    // Public method to get the single instance
    public static synchronized CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    // Method to produce a car
    public void produceCar(String model) {
        totalCarsProduced++;
        System.out.println(
            "Producing car #" + totalCarsProduced + ": " + model
        );
    }

    // Method to produce a Fleet of cars
    public void produceFleet(String model, int quantity) {
        System.out.println(
            "Starting batch production for " + quantity + " units..."
        );
        for (int i = 1; i <= quantity; i++) {
            produceCar(model + " (Fleet Unit " + i + ")");
        }
    }

    // Method to get total cars produced
    public int getTotalCarsProduced() {
        return totalCarsProduced;
    }

    // Method to display factory stats
    public void displayStats() {
        System.out.println("\n--- Car Factory Statistics ---");
        System.out.println("Total Cars Produced: " + totalCarsProduced);
        System.out.println("-----------------------------\n");
    }
}
