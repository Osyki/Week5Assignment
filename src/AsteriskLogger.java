public class AsteriskLogger implements Logger{
    @Override
    public void Log(String string) {
        System.out.println("***" + string + "***");
    }

    @Override
    public void Error(String string) {
        String asterisks = "******************";
        System.out.println(asterisks);
        System.out.println("***ERROR: " + string + "***");
        System.out.println(asterisks);
    }
}
