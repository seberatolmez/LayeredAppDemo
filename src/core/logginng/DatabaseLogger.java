package core.logginng;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Logged to Database"+data);
    }
}
