public abstract class Vehicle implements Motorbike, Car {

    boolean seatheating,airbag,abs,sunroof,musicsystem;
    int totalprice;

    public abstract void addBaseprice(int baseprice);

    @Override
    public boolean abs(boolean abs) {
        if (abs) { totalprice += 5000;}
        this.abs = abs;
        return Car.super.abs(abs);
    }

    @Override
    public boolean musicSystem(boolean musicsystem) {
        if (musicsystem){ totalprice+=1000;}
        this.musicsystem = musicsystem;
        return Car.super.musicSystem(musicsystem);
    }
    @Override
    public boolean airbag(boolean airbag) {
        if (airbag){ totalprice+=3000;}
        this.airbag = airbag;
        return Car.super.airbag(airbag);
    }
    @Override
    public boolean sunroof(boolean sunroof) {
        if (sunroof) {totalprice += 2000;}
        this.sunroof = sunroof;
        return Car.super.sunroof(sunroof);
    }
    @Override
    public boolean seatheating(boolean seatheating) {
        if (seatheating) {totalprice += 2000;}
        this.seatheating = seatheating;
        return Motorbike.super.seatheating(seatheating);
    }
    public int getTotalprice() {
        return totalprice;
    }

    @Override
    public String toString() {

        String str = "";

        if (abs || musicsystem || sunroof || airbag || seatheating) {

            str += "with";

        }
        if (musicsystem){
            str += " Music System ";
        }
        if(seatheating){
            str += " Seat Heating";
        }
        if (abs) {
            str += " ABS";
        }
        if (sunroof) {
            str += " Sunroof";
        }
        if (airbag) {
            str += " Air Bag optional";
        }
        if (!abs) {
            str = str.replaceFirst(",", "");
        }
        str += " having a total price of " + totalprice + " TL";

        return str;
    }
}
