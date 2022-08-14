package airConditioner;

public class AirConditioner {

    public String isOn(String on){
        if (on == "on"){
            System.out.println("Ac is on");
        }
        return on;
    }

    public String isOff(String off){
        if (off == "off"){
            System.out.println("Ac is off");
        }
        return off;
    }

    public int increaseAndDecreaseTemperature(int temperature){
        if (temperature < 16){
            temperature = 16;
        }

        if(temperature > 30){
            temperature = 30;
        }

        System.out.println("Temperature increase to: " + temperature);
        return temperature;
    }

}
