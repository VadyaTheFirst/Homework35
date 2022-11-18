import Cars.Bus;
import Cars.LightWeight;
import Cars.Truck;

public class Main {
    public static void main(String[] args) {



        Cars.LightWeight car = new LightWeight("Lada","kalina",2011,"rf","red",120,1.2f,"Купе");
        System.out.println(car.toString());

        Cars.Truck truck = new Truck("MAC","ff",2010,"Germany","blue",120,1.2f,"К40");
        System.out.println(truck.toString());

        Cars.Bus bus = new Bus("Mercedes", "ХЗ", 2012, "Германия", "", 120,3f,"120-150 мест");
        System.out.println(bus.toString());

    }
}