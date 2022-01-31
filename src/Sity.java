public class Sity extends Vehicle {
    final int baseprice = 40000;

    public Sity() {
        addBaseprice(baseprice);
    }

    @Override
    public void addBaseprice(int baseprice) {
        totalprice += baseprice;
    }

    @Override
    public String toString() {


        return "Sity " + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }


}
