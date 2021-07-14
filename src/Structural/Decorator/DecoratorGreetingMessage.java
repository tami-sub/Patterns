package Structural.Decorator;

public class DecoratorGreetingMessage extends Decorator {
    public DecoratorGreetingMessage(PlatformMessage message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return String.format("%s | Greetings you got a gift, check it out",super.getMessage());
    }
}
