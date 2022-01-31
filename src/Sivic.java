public class Sivic extends Vehicle implements Motorbike {
    final int baseprice = 50000;
    public Sivic() { addBaseprice(baseprice);}

    @Override
    public void addBaseprice(int baseprice) {
        totalprice += baseprice;
    }

    @Override
    public String toString() {
        return "Sivic " + super.toString();
    }

}

