public class AsteriskLogger implements Logger{
    @Override
    public void Log(String string) {
        System.out.println("***" + string + "***");
    }

    @Override
    public void Error(String string) {
        String asterisks = "****************";
        System.out.println(asterisks);
        Log(string);
        System.out.println(asterisks);
    }
}
