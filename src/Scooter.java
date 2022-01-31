public class Scooter extends Vehicle {
    final int baseprice = 20000;

    public Scooter() { addBaseprice(baseprice);}

    @Override
    public void addBaseprice(int baseprice) { totalprice += baseprice;}
    @Override
    public String toString() { return "Scooter " + super.toString();}
}