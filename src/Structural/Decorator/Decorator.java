package Structural.Decorator;

public class Decorator implements Service{
    private final PlatformMessage message;

    public Decorator(PlatformMessage message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message.getMessage();
    }
}
