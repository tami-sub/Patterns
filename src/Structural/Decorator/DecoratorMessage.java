package Structural.Decorator;

public class DecoratorMessage extends Decorator {
    public DecoratorMessage(PlatformMessage message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return String.format("%s | Try to reply to the sender!",super.getMessage());
    }
}
