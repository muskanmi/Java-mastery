package oops2;

public class Car extends Vehicle {

    // method overriding (start is the method of vehicle class parent class)
    void start(){
        super.start(); // invoking immediate parent class function (in this case vehicle start method is calling
        System.out.println(this); // this keyword in inheritance
        System.out.println(this.wheelsCount + " Car is starting");
        System.out.println(this.model + " Car");
    }

    Car() {
        super(3);
        System.out.println("Car is being created");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println(obj.wheelsCount); // 3;
        obj.wheelsCount = 4;
        obj.model = "Lamberghini";
        obj.gear = "6";
        obj.start(); // inheriting the vehicle class properties and behaviours.
        System.out.println(obj.wheelsCount); // 4
    }
}
