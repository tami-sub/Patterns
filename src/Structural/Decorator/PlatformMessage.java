package Structural.Decorator;

public class PlatformMessage implements Service{
    private final String platformName;
    PlatformMessage(String platformName){
        this.platformName = platformName;
    }
    @Override
    public String getMessage() {
        return "You got a message!";
    }
}
