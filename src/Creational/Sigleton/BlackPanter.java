package Creational.Sigleton;

public class BlackPanter {
    private static BlackPanter instance;
    private final String value;

    private BlackPanter(String value) {
        this.value = value;
    }

    public static BlackPanter getInstance(String value) {
        if (instance == null) {
            instance = new BlackPanter(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
