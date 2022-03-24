public class App {
    public static void main(String[] args) {
        AsteriskLogger asteriskLog = new AsteriskLogger();
        asteriskLog.Log("Hello");
        asteriskLog.Error("test error");

        SpacedLogger spaceLog = new SpacedLogger();
        spaceLog.Log("Hello");
        spaceLog.Error("spacederror");
    }
}
