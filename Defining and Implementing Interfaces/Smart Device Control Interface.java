// SmartDevice.java
public interface SmartDevice {
    void turnOn();
    void turnOff();
}

// Light.java
public class Light implements SmartDevice {
    private String id;
    public Light(String id){this.id=id;}
    public void turnOn(){ System.out.println(id + " Light turned ON"); }
    public void turnOff(){ System.out.println(id + " Light turned OFF"); }
}

// AC.java
public class AC implements SmartDevice {
    private String id;
    public AC(String id){this.id=id;}
    public void turnOn(){ System.out.println(id + " AC cooling started"); }
    public void turnOff(){ System.out.println(id + " AC stopped"); }
}

// Demo
public class SmartDeviceDemo {
    public static void main(String[] args){
        SmartDevice l = new Light("LivingRoom");
        SmartDevice ac = new AC("Bedroom");
        l.turnOn(); ac.turnOn();
        l.turnOff(); ac.turnOff();
    }
}
