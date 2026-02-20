package db;

public class DbIntegrity extends RuntimeException {
    public DbIntegrity(String message) {
        super(message);
    }
}
