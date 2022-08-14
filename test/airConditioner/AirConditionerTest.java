package airConditioner;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirConditionerTest {

    private AirConditioner airConditioner;

    @BeforeEach
    public void inItSetup(){

        airConditioner = new AirConditioner();
    }

    @Test
    public void test_isOn(){
        String isOn = airConditioner.isOn("on");
        Assertions.assertEquals(isOn , "on");
    }

    @Test
    public void test_isOff(){
        String isOff = airConditioner.isOff("off");
        Assertions.assertEquals(isOff , "off");
    }

    @Test
    public void test_increaseAndDecreaseTemperature(){
        int theTemperature = airConditioner.increaseAndDecreaseTemperature(16);
        Assertions.assertEquals(theTemperature, 16);
    }

}