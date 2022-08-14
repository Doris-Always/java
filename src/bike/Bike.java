package bike;

public class Bike {

    private boolean bikeIsOn;

    private int gear;

    private int speed = 0;


    public void bikeIsOnOrOff(boolean bikeIsOn) {
        this.bikeIsOn = bikeIsOn;

    }

    public boolean retrievePower(){
        return bikeIsOn;
    }


    public void setSpeed(int speed) {
       this.speed = speed;
    }


    public void setGear(int gear) {
        this.gear = gear;
    }

    public void increaseAcceleration(){
        if (gear == 0 && speed <= 20){
            speed = speed + 1;
            gear = 1;
            System.out.println("i am increased by 1");
        } else if (gear == 1 && speed >= 21) {
            speed = speed + 2;
            gear = 2;
            System.out.println("i am in gear 2");
            System.out.println("i am increased by 2");
        } else if (gear == 2 && speed >= 31) {
            speed = speed + 3;
            gear = 3;
            System.out.println("i am increased by 3");

        } else if (gear == 3 && speed >= 41) {
            speed = speed + 4;
            gear = 4;
            System.out.println("i am increased by 4");
        }
    }

    public int getIncreaseAcceleration(){
        return speed;
    }


    public void decceleration(){
        if (gear == 1){
            speed = speed - 1;
            System.out.println("i am decrease by 1");
        } else if (gear == 2) {
            speed = speed - 2;
            System.out.println("i am decreased by 2");
        } else if (gear == 3) {
            speed = speed - 3;
            System.out.println("i am decreased by 3");

        } else if (gear == 4) {
            speed = speed - 4;
            System.out.println("i am decreased by 4");
        }
    }

    public int getDeceleration(){
        return speed;
    }

}


