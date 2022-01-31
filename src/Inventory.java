import java.util.ArrayList;
public class Inventory {

    private final ArrayList<Object> list;

    public Inventory() {
        list = new ArrayList<>();
    }
    public void add(Object o) {
        list.add(o);
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        int countcars = 0,countbikes = 0,totalprice = 0;

        for (Object object : list) {
            if (object instanceof Sity) {
                countcars++;
                totalprice += ((Sity) object).getTotalprice();
            }
            if (object instanceof Sivic) {
                countcars++;
                totalprice += ((Sivic) object).getTotalprice();
            }

            if (object instanceof Racer) {
                countbikes++;
                totalprice += ((Racer) object).getTotalprice();
            }
            if (object instanceof Scooter) {
                countbikes++;
                totalprice += ((Scooter) object).getTotalprice();
            }

            str.append(object).append("\n");
        }
        if (countbikes > 0 && countcars > 0) {
            return str + "\n" + "TOTAL: " + (list.size()) + " Vehicles including " + countcars + " Cars and " + countbikes+" Motorbikes "
                    + "having a total price of " + totalprice + " TL";

/*

        } else if (countbikes > 0) {
            return str + "\n" + "TOTAL: " + (list.size()) + " Vehicles all are Motorbikes "
                    + "having a total price of " + totalprice + " TL";
        } else if (countcars > 0) {
            return str + "\n" + "TOTAL: " + (list.size()) + " Vehicles all are Cars "
                    + "having a total price of " + totalprice + " TL";
        }
*/




    }return "Inventory is empty";
    }
}



