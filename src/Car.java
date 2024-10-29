public class Car extends Vehicle{
    private int numDoors;

    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public void move() {
        System.out.println("The car is moving");
    }

    @Override
    public void showInfo(){
        System.out.println("Number Doors: "+getNumDoors()+", brand: "+getBrand()+", model: "+getModel()+", year: "+getYear());
    }
}
