public class Hangar {

    static Car rottenCar = new Car("Clio", 35);
    static Boat rottenBoat = new Boat("Titanic", 235);

    public static void main(String[] args) {

        System.out.println(rottenCar.doStuff());
        System.out.println(rottenBoat.doStuff());

    }
}