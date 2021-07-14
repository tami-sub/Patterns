package Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        DecoratorMessage message = new DecoratorMessage(new PlatformMessage("VK"));
        System.out.println(message.getMessage());

        Decorator message2 = new DecoratorGreetingMessage(new PlatformMessage("VK"));
        System.out.println(message2.getMessage());
    }
}
