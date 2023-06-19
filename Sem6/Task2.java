package Sem6;

//2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:

public class Task2 {
    
    public interface SpeedCalculation{
        double calculateAllowedSpeed(Vehicle vehicle);
    }

    public class Vehicle{
        int maxSpeed;
        String type;

        public Vehicle(int maxSpeed, String type){
            this.maxSpeed = maxSpeed;
            this.type = type;
        }

        public int getMaxSpeed() {
            return this.maxSpeed;
        }

       
        public String getType() {
            return this.type;
        }
                       
    }

    public class Bus extends Vehicle implements SpeedCalculation{
        public Bus(int maxSpeed, String type){
            super(maxSpeed, type);
        }

        public double calculateAllowedSpeed(Vehicle vehicle){
            return vehicle.getMaxSpeed() * 0.6;
        }
    }

    public class Car extends Vehicle implements SpeedCalculation{
        public Car(int maxSpeed, String type){
            super(maxSpeed, type);
        }
        public double calculateAllowedSpeed(Vehicle vehicle){
            return vehicle.getMaxSpeed() * 0.8;
        }
    }
}

// есть сомнения в правильности реализации...
