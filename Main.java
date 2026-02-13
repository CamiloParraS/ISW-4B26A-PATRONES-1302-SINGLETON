public class Main {

    public static void main(String[] args) {
        // Get a instance of the factory
        CarFactory factory1 = CarFactory.getInstance();

        // Produce some cars
        factory1.produceCar("Tesla Model 3");
        factory1.produceCar("Ford Mustang");
        factory1.produceCar("Chevrolet Corvette");

        // Get another factory
        CarFactory factory2 = CarFactory.getInstance();

        // Produce more cars using the second Factory
        factory2.produceCar("Toyota Camry");
        factory2.produceCar("Honda Civic");

        // Display factory stats
        factory1.displayStats();

        // Both references show the same total count
        System.out.println(
            "Total cars from factory1: " + factory1.getTotalCarsProduced()
        );
        System.out.println(
            "Total cars from factory2: " + factory2.getTotalCarsProduced()
        );

        // Produce a fleet of cars
        factory1.produceFleet("Renault Twingo", 10);

        // display the stats again
        factory1.displayStats();
    }
}
