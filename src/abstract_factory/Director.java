public class Director {
    public void constructCar(Builder builder) {
        builder.setVehicleType(VehicleType.CAR);
        builder.setSeats(4);
        builder.setEngine(New Engine(3, 0))
    }

    public void constructBus(Builder builder) {
        builder.setVehicleType(VehicleType.BUS);
        builder.setSeats(40);
        builder.setEngine(New Engine(5, 0))
    }
}