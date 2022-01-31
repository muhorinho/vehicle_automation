public class TestInventory {


    public static void main(String[] args) {
        Inventory inventory = new Inventory();


        Vehicle vehicle = new Sivic();
        vehicle.abs(true);
        vehicle.musicSystem(true);
        vehicle.airbag(true);

        inventory.add(vehicle);


        vehicle = new Sivic();
        vehicle.abs(true);
        vehicle.sunroof(true);
        inventory.add(vehicle);


        vehicle = new Sity();
        vehicle.musicSystem(true);
        vehicle.sunroof(true);
        inventory.add(vehicle);


        Vehicle mBike = new Racer();
        mBike.abs(true);
        mBike.seatheating(true);
        inventory.add(mBike);


        mBike = new Scooter();
        mBike.seatheating(true);
        inventory.add(mBike);


        System.out.println(inventory);
    }}
