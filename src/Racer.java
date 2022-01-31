public class Racer extends Vehicle {
    final int baseprice = 60000;
    public Racer() {
        addBaseprice(baseprice);
    }
    @Override
    public void addBaseprice(int baseprice) {
        totalprice+=baseprice;
    }
    @Override
    public String toString() {
        //the bike type + the super class string
        return "Racer " + super.toString();
    }
}