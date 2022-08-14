package bike;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {

    @Test
    @DisplayName("Turn bike on or off")
    public void turnBikeOnOrOff(){
        Bike bike = new Bike();

        bike.bikeIsOnOrOff(false);

        assertEquals( false, bike.retrievePower());

    }


    @Test
    public void checkBikeAcceleration(){
        Bike bike = new Bike();

        bike.bikeIsOnOrOff(true);

        bike.setSpeed(20);
        System.out.println("speed is 20");

    }

    @Test
    public void increaseAccelerationAndIncreaseGear(){
        Bike bike = new Bike();

        bike.bikeIsOnOrOff(true);

        bike.setSpeed(30);
        bike.setGear(3);
        bike.increaseAcceleration();
        assertEquals(33, bike.getIncreaseAcceleration());
    }
    @Test
    public void decreaseAccelerationAndDecreaseGear(){
        Bike bike = new Bike();

        bike.bikeIsOnOrOff(true);

        bike.setSpeed(20);
        bike.setGear(4);
        bike.decceleration();
//        System.out.println("i am increased by 3");
        assertEquals(16, bike.getDeceleration());
    }

}