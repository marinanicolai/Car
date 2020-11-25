public class Car {
    double fuel_efficiency;
    double amountOfFuelInTank;

    // constructor
    public Car(double fuel_efficiency) {
        this.fuel_efficiency = fuel_efficiency;
        amountOfFuelInTank = 0;
    }

    // drive method
    public void drive(int miles) {
        double usedFuel = miles / fuel_efficiency;
        amountOfFuelInTank -= usedFuel;
    }

    // get method
    public double getGasLevel() {
        return amountOfFuelInTank;
    }

    // setter
    public void addGas(int gallons) {
        amountOfFuelInTank += gallons;
    }

    public static void main(String args[]) {

        Car myHybrid = new Car(50); // 50 miles per gallon
        myHybrid.addGas(20); // Tank 20 gallons

        myHybrid.drive(100); // Drive 100 miles

        System.out.println(myHybrid.getGasLevel()); // Print fuel remaining.

    }

}

// Implement a class Car with the following properties. A car has a certain fuel
// efficiency (measured in miles/gallon) and a certain amount of fuel in the gas
// tank.
// The efficiency is specified in the constructor, and the initial fuel level is
// 0.
// Supply a method drive that simulates driving the car for a cartain distance,
// reducing the fuel level in the gas tank, and methods getGasLevel, to return
// the
// current fuel level and addGas, to tank up. Sample usage:

// Car myHybrid = new Car(50); //50 miles per gallon

// myHybrid.addGas(20); // Tank 20 gallons

// myHybrid.drive(100); // Drive 100 miles

// System.out.println(myHybrid>.getGasLevel()); // Print fuel remaining.
