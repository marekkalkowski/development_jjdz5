public class Car {
    public String name;
    public int maxSpeed;
    private int currentSpeed;


    public void startEngine (){
        currentSpeed = 0;
        System.out.println("Engine started");
    }

    public void stopEngine (){
        currentSpeed = 0;
        System.out.println("Engine stoped");
    }

    public String whatMaxSpeedWas (int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return "Max speed is: " + maxSpeed + "km/h";
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
       this.currentSpeed = currentSpeed;
   }

    public void accelerate1(){
        this.currentSpeed += 10;
    }
}
