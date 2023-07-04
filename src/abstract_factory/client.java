public class Client {
    public static void main(String[] args) {
        Director director = New Director();

        CarBuilder builder = New CarBuilder();

        director.constructCar(builder);

        Car car = builder.getResult();

        System.out.println("Car built:\n" + car.getType());
    }
}