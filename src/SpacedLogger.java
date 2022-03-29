public class SpacedLogger implements Logger{


    @Override
    public void Log(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
        System.out.print("\n");
    }

    @Override
    public void Error(String string) {
        System.out.print("ERROR: ");
        Log(string);
    }
}
