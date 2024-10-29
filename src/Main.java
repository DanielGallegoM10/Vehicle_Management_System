import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Garage garage = new Garage();

        int num = -1;
        System.out.println("Vehicle Management System");
        while(num != 5){
            System.out.println("1 Add a Car / 2 Add a Motorcycle / 3 Show all vehicles in the garge / 4 Move all vehicles / 5 Exit");
            num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case 1:
                    System.out.println("Set Number Doors: ");
                    int numDoors = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Set Brand: ");
                    String brandC = sc.nextLine();
                    System.out.println("Set Model: ");
                    String modelC = sc.nextLine();
                    System.out.println("Set Year: ");
                    int yearC = sc.nextInt();
                    sc.nextLine();

                    Vehicle car = new Car(brandC, modelC, yearC, numDoors);
                    garage.addVehicle(car);
                    break;
                case 2:
                    System.out.println("Set Engine Capacity: ");
                    int eCapacity = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Set Brand: ");
                    String brandM = sc.nextLine();
                    System.out.println("Set Model: ");
                    String modelM = sc.nextLine();
                    System.out.println("Set Year: ");
                    int yearM = sc.nextInt();
                    sc.nextLine();

                    Vehicle motorcycle = new Motorcycle(brandM, modelM, yearM, eCapacity);
                    garage.addVehicle(motorcycle);
                    break;

                case 3:
                    garage.showVehicles();
                    break;

                case 4:
                    garage.moveAll();
                    break;
            }

        }



    }
}