package employeemanagement;
import java.util.Scanner;
public class Worker {
    private String factory;

    public Worker() {
    }

    public Worker(String factory) {
        this.factory = factory;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}
