public class Motorcycle extends Vehicle{
    private int engineCapacity;

    public Motorcycle(String brand, String model, int year, int engineCapacity) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void move() {
        System.out.println("The motorcycle is moving");
    }

    public void showInfo(){
        System.out.println("Engine capacity: "+getEngineCapacity()+", brand: "+getBrand()+", model: "+getModel()+", year: "+getYear());
    }
}
