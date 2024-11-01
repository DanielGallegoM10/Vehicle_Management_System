import java.util.ArrayList;

public class Garage {
    ArrayList<Vehicle> garage = new ArrayList<>();

    public void addVehicle (Vehicle vehicle){
        garage.add(vehicle);
    }

    public void showVehicles(){
        if (garage != null){
            for (Vehicle vehicle : garage){
                vehicle.showInfo();
            }
        }else System.out.println("The garage is empty");
    }


    public void moveAll(){
        if (garage != null){
            for (Vehicle vehicle : garage){
                vehicle.move();
            }
        }else System.out.println("The garage is empty");
    }



}
